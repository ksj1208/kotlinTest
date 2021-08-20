package com.imo.kotlintest.common

import mu.KLogging
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class CommonExceptionHandler {
    private val logger = KLogging().logger

    @ExceptionHandler(value = [RuntimeException::class])
    fun runTimeExceptionHandler(e:RuntimeException) :ResponseEntity<String> {
        logger.error { e }
        return ResponseEntity.badRequest().build()
    }

    @ExceptionHandler(value = [Exception::class])
    fun exceptionHandler(e:Exception) :ResponseEntity<String> {
        logger.error { e }
        return ResponseEntity.badRequest().build()
    }
}