package com.example.WebSecureKotlin

import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class SimpleController {
    @RequestMapping("")
    fun index():String{
        return "home"
    }
    @RequestMapping("/home")
    fun home():String{
        return "home"
    }

    @RequestMapping("/login")
    fun login():String{
        return "login"
    }

    @RequestMapping("info")
    @ResponseBody
    fun info():String{
        val authentication: Authentication = SecurityContextHolder.getContext().authentication
        val name = authentication.name

        return "Info: $name"
    }
}
