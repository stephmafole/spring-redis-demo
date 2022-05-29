package com.stephen.demos.springredis

import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long>

