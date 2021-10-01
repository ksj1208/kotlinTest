package com.imo.kotlintest.board.controller

import com.imo.kotlintest.user.CustomUserDetails
import org.springframework.http.ResponseEntity
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
class BoardApiController {

    @PostMapping("/boards/save")
    fun save(@AuthenticationPrincipal userDetails: CustomUserDetails): ResponseEntity<String> {
        val u = userDetails
        return ResponseEntity.ok().build();
    }
}