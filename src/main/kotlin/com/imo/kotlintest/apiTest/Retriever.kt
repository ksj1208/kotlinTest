package com.imo.kotlintest.apiTest

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Retriever(
        @Id
        @Column(name = "RETRIEVER_KEY")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val retrieverKey:Long? = null,

        @Column(name = "CALLBACK")
        val callback:String? = null,

        @Column(name = "RECEPTION_DATE")
        val receptionDate:LocalDateTime? = null
)