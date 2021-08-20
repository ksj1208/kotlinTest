package com.imo.kotlintest.apiTest

import org.springframework.stereotype.Service

@Service
class ApiService(val apiRepository: ApiRepository) {

    fun contentSave(apiRequest: ApiRequest) {
        apiRepository.save(apiRequest.toEntity())
    }
}