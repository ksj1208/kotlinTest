package com.imo.kotlintest.common

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebResourcesConfig :WebMvcConfigurer{

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        super.addResourceHandlers(registry)

        registry.addResourceHandler("/image/**")
            .addResourceLocations("file:/Applications/upload/image/")
    }
}