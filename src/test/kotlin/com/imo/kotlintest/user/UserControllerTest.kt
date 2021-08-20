package com.imo.kotlintest.user

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf
import org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.*
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class UserControllerTest {

    @Autowired
    lateinit var mockMvc:MockMvc

    @Test
    @DisplayName("로그인 테스트")
    fun loginTest() {
        mockMvc.perform(MockMvcRequestBuilders.post("/login")
                .param("userId", "ksj")
                .param("password", "test")
                .with(csrf()))
                .andExpect(authenticated())
    }

    @Test
    @DisplayName("회원가입 테스트")
    fun createUser() {
        mockMvc.perform(MockMvcRequestBuilders.post("/users/create")
                .param("userId", "test99")
                .param("password", "test!@")
                .with(csrf()))
                .andExpect(status().isOk)
    }
}