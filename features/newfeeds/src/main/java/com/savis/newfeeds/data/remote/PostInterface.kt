package com.savis.newfeeds.data.remote

import androidx.lifecycle.LiveData
import com.aibles.repository.utils.Resource
import com.savis.newfeeds.domain.model.Post
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface PostInterface {
    @GET("Akaizz/static/master/newsfeed.json")
    fun getPost(): LiveData<Resource<ArrayList<Post>>>


}