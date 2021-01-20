package com.aibles.remote

import com.aibles.model.User
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path

interface UserService {

    @GET("users")
    fun getAllUsers(): Deferred<List<User>>

    @GET("users/{login}")
    fun getUserDetail(@Path("login") login: String): Deferred<User>
}