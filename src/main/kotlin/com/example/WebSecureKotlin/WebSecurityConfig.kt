package com.example.WebSecureKotlin

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@EnableWebMvc
@Configuration
class WebSecurityConfig : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {
        http?.let{
            it.authorizeRequests()
                .antMatchers("/","/home")
                .permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                //.loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll()
        }
    }
}
