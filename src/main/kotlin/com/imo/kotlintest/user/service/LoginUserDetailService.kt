package com.imo.kotlintest.user.service

import com.imo.kotlintest.user.CustomUserDetails
import com.imo.kotlintest.user.dao.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class LoginUserDetailService(@Autowired private val userRepository: UserRepository) :UserDetailsService {

    override fun loadUserByUsername(userId: String): UserDetails {
        return userRepository.findByUserId(userId)?.let { CustomUserDetails.from(it) } ?: throw UsernameNotFoundException("회원 정보가 없습니다.")
    }
}