package com.stephen.demos.springredis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringRedisDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringRedisDemoApplication>(*args)
}
