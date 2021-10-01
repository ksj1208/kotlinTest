package com.imo.kotlintest.board.entity

import javax.persistence.*

@Entity
@Table(name = "BOARD")
class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val boardId: Long?= null
    val content: String?= null
    val userCode: Long?= null
}