package com.imo.kotlintest

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder

@SpringBootTest
class KotlinTestApplicationTests {

    @Autowired
    lateinit var passwordEncoder: PasswordEncoder

    @Test
    fun contextLoads() {
        val password = passwordEncoder.encode("test123!@")
        println(password)
    }

}
