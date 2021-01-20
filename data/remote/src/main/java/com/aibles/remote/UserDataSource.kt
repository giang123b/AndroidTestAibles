package com.aibles.remote


class UserDataSource(private val userService: UserService) {
    fun getAllUsers() =
        userService.getAllUsers()

    fun getUserDetail(login: String) =
        userService.getUserDetail(login)

}