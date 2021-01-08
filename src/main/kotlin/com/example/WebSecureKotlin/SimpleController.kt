package com.example.WebSecureKotlin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class SimpleController {
    @RequestMapping("")
    @ResponseBody
    fun index():String{
        return "home"
    }
    @RequestMapping("/home")
    @ResponseBody
    fun home():String{
        return "home"
    }

    @RequestMapping("/login")
    @ResponseBody
    fun login():String{
        return "login"
    }
}
