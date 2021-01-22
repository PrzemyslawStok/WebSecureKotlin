package com.example.WebSecureKotlin

import org.springframework.beans.factory.annotation.Value
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class SimpleController {
    @Value("\${server.port}")
    var port: String? = null

    @RequestMapping("")
    fun index():String{
        return "home"
    }
    @RequestMapping("/home")
    fun home(model: Model):String{
        model.addAttribute("name","Przemysław")
        return "home"
    }

    @RequestMapping("/login")
    fun login():String{
        return "login"
    }

    @RequestMapping("info")
    @ResponseBody
    fun info(model: Model):String{

        val authentication: Authentication = SecurityContextHolder.getContext().authentication

        val name = authentication.name
        val principal = authentication.principal

        return "Info: $name"
    }

    @RequestMapping("app")
    @ResponseBody
    fun appInfo():String{
        return "Port: $port"
    }
}
