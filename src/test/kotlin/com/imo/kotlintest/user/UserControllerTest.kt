package com.imo.kotlintest.user

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf
import org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.*
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
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
                .content("{\"userId\" : \"" + "ksj" + "\", \"password\" : \"" + "test!@" + "\"}")
                .contentType(MediaType.APPLICATION_JSON)
                .with(csrf()))
                .andExpect(status().isOk)
    }
}