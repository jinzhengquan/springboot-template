package com.example.demo

import com.example.demo.core.annotation.EnableGlobalExceptionHandler
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.logging.Logger

@SpringBootApplication
@EnableGlobalExceptionHandler
class DemoApplication
private val logger = LoggerFactory.getLogger(DemoApplication::class.java)

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
	logger.info("testssss");
}
