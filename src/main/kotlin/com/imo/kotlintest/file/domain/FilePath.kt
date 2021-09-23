package com.imo.kotlintest.file.domain

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource
import java.nio.file.Path
import java.nio.file.Paths

@Configuration
@ConfigurationProperties(prefix = "file-path")
class FilePath {
    lateinit var root:String
    lateinit var image:String

    fun getPhotoImageUploadPath() : Path {
        return Paths.get(root + image)
        //return Paths.get("src/main/resources/static/image/")
    }
}