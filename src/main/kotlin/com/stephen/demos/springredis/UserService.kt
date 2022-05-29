package com.stephen.demos.springredis

class UserService(
    private val userRepository: UserRepository
) {

    fun findAll(): List<User> {
        val users = userRepository.findAll()
        return users.toList()
    }
}
