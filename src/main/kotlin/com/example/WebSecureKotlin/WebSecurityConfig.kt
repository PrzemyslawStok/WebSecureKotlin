package com.example.WebSecureKotlin

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@EnableWebMvc
@Configuration
class WebSecurityConfig : WebSecurityConfigurerAdapter() {

}