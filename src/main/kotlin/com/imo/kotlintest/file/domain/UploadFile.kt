package com.imo.kotlintest.file.domain

import org.springframework.util.StringUtils
import org.springframework.web.multipart.MultipartFile
import java.nio.file.Files
import java.nio.file.Path
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class UploadFile (val file:MultipartFile, val path: Path){
    private lateinit var uploadFilePath:Path

    fun upload(): Path {
        Files.createDirectories(path)
        createTargetPath()
        file.transferTo(uploadFilePath)
        return uploadFilePath
    }

    fun createTargetPath() {
        val fileName = "test_${LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyymmddHHmmss"))}"
        val extension = ".${StringUtils.getFilenameExtension(file.originalFilename)}"
        uploadFilePath = path.resolve(fileName + extension)
    }

    fun getUploadFilePath(): String {
        return uploadFilePath.fileName.toString()
    }
}