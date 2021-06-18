package com.example.demo.core.config

import com.example.demo.core.exceptions.RemoteServerException
import com.example.demo.domain.exceptions.DomainException
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.client.ClientHttpResponse
import org.springframework.lang.NonNull
import org.springframework.web.client.ResponseErrorHandler
import org.springframework.web.client.RestTemplate
import java.io.IOException
import java.time.Duration

@Configuration
@EnableConfigurationProperties(RemoteServerProp::class)
class RestTemplateConfiguration {
    @Autowired
    lateinit var remoteServerProp: RemoteServerProp;

    @Bean
    fun remoteServerRestTemplate(errorHandler: ResponseErrorHandler?): RestTemplate? {
        val timeout = Duration.ofSeconds(remoteServerProp.timeout)
        return RestTemplateBuilder()
            .rootUri(remoteServerProp.url)
            .setConnectTimeout(timeout)
            .setReadTimeout(timeout)
            .errorHandler(errorHandler)
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build()
    }

    @Bean
    fun remoteServerErrorHandler(): ResponseErrorHandler? {
        return object : ResponseErrorHandler {
            @Throws(IOException::class)
            override fun hasError(@NonNull response: ClientHttpResponse): Boolean {
                return !response.statusCode.is2xxSuccessful
            }

            @Throws(IOException::class)
            override fun handleError(@NonNull response: ClientHttpResponse) {
                if (response.statusCode == HttpStatus.BAD_REQUEST) {
                    val mapper = ObjectMapper()
                    val jsonNode = mapper.readValue(
                        response.body,
                        JsonNode::class.java
                    )
                    val errorCode = jsonNode.findValue("errorCode").asText()
                    val errorMessage = jsonNode.findValue("errorMessage").asText()
                    throw RemoteServerException(errorCode, listOf(errorMessage))
                } else {
                    throw DomainException();
                }
            }
        }
    }
}