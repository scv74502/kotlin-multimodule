package com.assignment.api

import com.assignment.core.log.logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TestController {
    @GetMapping
    fun getCount():String{
        logger.info("[testController] /api")
        return  "testController"
    }
}