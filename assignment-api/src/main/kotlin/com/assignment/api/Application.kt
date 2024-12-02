package com.assignment.api

import jakarta.annotation.PostConstruct
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AssignmentApplication

fun main(args: Array<String>) {
    runApplication<AssignmentApplication>(*args)
}
