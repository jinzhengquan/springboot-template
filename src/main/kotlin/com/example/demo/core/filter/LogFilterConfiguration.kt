package com.example.demo.core.filter

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LogFilterConfiguration {
    @Bean
    @ConditionalOnMissingBean(LogFilter::class)
    fun initOTRLogRequestFilter(): LogFilter? {
        return LogFilter()
    }

}