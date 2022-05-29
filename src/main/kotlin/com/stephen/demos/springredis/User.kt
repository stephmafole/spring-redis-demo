package com.stephen.demos.springredis

import org.springframework.data.redis.core.RedisHash

@RedisHash("Session")
class User(
    val firstname: String,
    val age: Int
)
