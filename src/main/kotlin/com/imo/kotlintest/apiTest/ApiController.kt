package com.imo.kotlintest.apiTest

import mu.KLogging
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

private val logger = KLogging()

@RestController
class ApiController(val apiService:ApiService) {

    @GetMapping("/tests/get")
    fun getTest() :ResponseEntity<String>{
        logger.logger().debug{ "test" }
        return ResponseEntity.ok().build()
    }

    @PostMapping("/retrievers/contentSave")
    fun contentSave(@RequestBody apiRequestDto:ApiRequest) :ResponseEntity<String> {
        apiService.contentSave(apiRequestDto)
        return ResponseEntity.ok().build()
    }
}