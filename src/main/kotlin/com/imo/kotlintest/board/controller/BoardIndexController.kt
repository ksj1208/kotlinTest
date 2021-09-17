package com.imo.kotlintest.board.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class BoardIndexController {

    @GetMapping("/board/writeBoardPage")
    fun writeBoardPage(): String {
        return "board/boardWrite"
    }
}