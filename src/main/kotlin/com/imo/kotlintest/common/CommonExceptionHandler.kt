package com.imo.kotlintest.common

import mu.KLogging
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class CommonExceptionHandler {
    private val logger = KLogging()

    @ExceptionHandler(value = [RuntimeException::class])
    fun runTimeExceptionHandler(e:RuntimeException) :ResponseEntity<String> {
        logger.logger.error { e }
        return ResponseEntity.badRequest().build()
    }

    @ExceptionHandler(value = [Exception::class])
    fun exceptionHandler(e:Exception) :ResponseEntity<String> {
        logger.logger.error { e }
        return ResponseEntity.badRequest().build()
    }
}