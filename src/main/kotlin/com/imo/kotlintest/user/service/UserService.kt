package com.imo.kotlintest.user.service

import com.imo.kotlintest.user.dao.UserRepository
import com.imo.kotlintest.user.dto.UserCreateRequest
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository, val passwordEncoder: PasswordEncoder) {
    fun save(dto: UserCreateRequest) {
        userRepository.save(dto.toEntity(passwordEncoder))
    }
}