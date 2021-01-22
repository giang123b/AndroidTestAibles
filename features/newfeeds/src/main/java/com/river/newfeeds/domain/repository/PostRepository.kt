package com.river.newfeeds.domain.repository

import androidx.lifecycle.LiveData
import com.river.newfeeds.domain.model.Post
import com.aibles.repository.utils.Resource
import com.river.newfeeds.domain.model.Items
import retrofit2.Call
import retrofit2.Response

interface PostRepository {

    suspend fun getPost() : LiveData<Resource<Items>>
}