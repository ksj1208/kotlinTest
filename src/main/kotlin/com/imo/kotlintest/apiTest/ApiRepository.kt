package com.imo.kotlintest.apiTest

import org.springframework.data.jpa.repository.JpaRepository

interface ApiRepository :JpaRepository<Retriever, Long>{
}