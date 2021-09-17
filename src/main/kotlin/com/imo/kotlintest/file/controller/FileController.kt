package com.imo.kotlintest.file.controller

import com.imo.kotlintest.file.dto.ImageUploadRequest
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class FileController {

    @PostMapping("/files/imageUpload")
    fun imageUpload(@ModelAttribute dto:ImageUploadRequest): String {
        return "callback"
    }
}