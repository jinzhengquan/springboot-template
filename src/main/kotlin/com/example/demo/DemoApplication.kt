package com.example.demo

import com.example.demo.core.annotation.EnableGlobalExceptionHandler
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableGlobalExceptionHandler
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
