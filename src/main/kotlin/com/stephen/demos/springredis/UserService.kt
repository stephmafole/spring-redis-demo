package com.stephen.demos.springredis

import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun findAll(): List<User> {
        val users = userRepository.findAll()
        return users.toList()
    }
}
