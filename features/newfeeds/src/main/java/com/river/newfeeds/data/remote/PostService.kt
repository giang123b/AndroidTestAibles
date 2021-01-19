package com.river.newfeeds.data.remote

import com.aibles.repository.utils.Resource
import com.river.newfeeds.domain.model.Items
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface PostService {

    @GET("Akaizz/static/master/newsfeed.json")
    suspend fun getPostsAsync(): Response<Items>

}