package com.example.WebSecureKotlin

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
}
