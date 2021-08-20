package com.imo.kotlintest.user.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UserIndexController {

    @GetMapping("/users/loginPage")
    fun loginPage() :String{
        return "login"
    }
}