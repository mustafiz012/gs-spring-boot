package com.musta.gs_spring_boot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DashboardController {

    @GetMapping("/")
    fun defaultHome(): String {
        return "Spring Boot application started"
    }

    @GetMapping("/spring/gs")
    fun springHome(): String {
        return "Hello from Spring Boot"
    }
}