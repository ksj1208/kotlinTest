package com.imo.kotlintest.file.controller

import com.imo.kotlintest.file.domain.FilePath
import com.imo.kotlintest.file.domain.UploadFile
import com.imo.kotlintest.file.dto.ImageUploadRequest
import mu.KLogging
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.multipart.MultipartFile
import java.nio.file.Path

@Controller
class FileController(val filePath: FilePath) {

    private val logger = KLogging().logger

    @PostMapping("/files/imageUpload")
    fun imageUpload(@ModelAttribute file:MultipartFile): ResponseEntity<String> {
        val imagePath = filePath.getPhotoImageUploadPath()
        val uploadFile = UploadFile(file, imagePath)
        uploadFile.upload()

        return ResponseEntity.ok(filePath.image + uploadFile.getUploadFilePath())
    }
}