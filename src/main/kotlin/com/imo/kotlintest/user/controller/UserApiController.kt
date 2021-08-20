package com.imo.kotlintest.user.controller

import com.imo.kotlintest.user.dto.UserCreateRequest
import com.imo.kotlintest.user.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserApiController(val userService: UserService) {

    @PostMapping("/users/create")
    fun userSave(@ModelAttribute dto:UserCreateRequest) :ResponseEntity<String> {
        userService.create(dto)
        return ResponseEntity.ok().build()
    }
}