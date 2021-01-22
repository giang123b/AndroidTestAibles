package com.aibles.detail.data.remote

import com.aibles.detail.domain.model.DetailPost
import retrofit2.Response
import retrofit2.http.GET

interface DetailPostService {

    @GET("Akaizz/static/master/detail.json")
    suspend fun getPostsAsync(): Response<DetailPost>

}