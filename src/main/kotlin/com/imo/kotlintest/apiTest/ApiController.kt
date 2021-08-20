package com.imo.kotlintest.apiTest

import mu.KLogging
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

private val logger = KLogging().logger

@RestController
class ApiController(val apiService:ApiService) {

    @GetMapping("/tests/get")
    fun getTest() :ResponseEntity<String>{
        logger.info {  "API GET REQUEST" }
        return ResponseEntity.ok().build()
    }

    @PostMapping("/retrievers/contentSave")
    fun contentSave(@RequestBody apiRequestDto:ApiRequest) :ResponseEntity<String> {
        logger.info { "REQUEST INFO [CALLBACK : ${apiRequestDto.callback}, REQ_DATE: ${apiRequestDto.reception_date}" }
        apiService.contentSave(apiRequestDto)
        return ResponseEntity.ok().build()
    }
}