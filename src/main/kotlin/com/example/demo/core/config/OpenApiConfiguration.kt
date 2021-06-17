package com.example.demo.core.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.tags.Tag
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.List

@Configuration
class OpenApiConfiguration {
    @Bean
    fun openApi(): OpenAPI? {
        return OpenAPI()
            .info(
                Info()
                    .title("spring boot template")
            )
            .tags(
                List.of(
                    Tag().name("spring boot template")
                )
            )
    }
}