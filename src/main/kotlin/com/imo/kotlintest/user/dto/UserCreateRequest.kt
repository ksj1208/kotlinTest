package com.imo.kotlintest.user.dto

import com.imo.kotlintest.user.entity.TblUser
import org.springframework.security.crypto.password.PasswordEncoder

class UserCreateRequest (val userId:String, val password:String){

    fun toEntity(passwordEncoder: PasswordEncoder) :TblUser {
        return TblUser(
                userId = userId,
                password = passwordEncoder.encode(password)
        )
    }
}