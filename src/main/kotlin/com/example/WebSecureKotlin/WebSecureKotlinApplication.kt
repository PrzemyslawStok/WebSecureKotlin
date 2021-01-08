package com.example.WebSecureKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication//(exclude=arrayOf(SecurityAutoConfiguration::class))
class WebSecureKotlinApplication

fun main(args: Array<String>) {
	runApplication<WebSecureKotlinApplication>(*args)
}
