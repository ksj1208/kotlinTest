package com.imo.kotlintest.apiTest

import java.time.LocalDateTime

data class ApiRequest (val callback:String, val reception_date:LocalDateTime) {
    fun toEntity():Retriever {
        return Retriever(
                callback = callback,
                receptionDate = reception_date
        )
    }
}