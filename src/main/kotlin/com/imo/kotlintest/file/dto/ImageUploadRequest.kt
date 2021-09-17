package com.imo.kotlintest.file.dto

import org.springframework.web.multipart.MultipartFile

class ImageUploadRequest (val filedata:MultipartFile, val callback:String, val callback_func:String){

}