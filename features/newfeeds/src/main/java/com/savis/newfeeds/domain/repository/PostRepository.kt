package com.savis.newfeeds.domain.repository

import androidx.lifecycle.LiveData
import com.aibles.repository.utils.Resource
import com.savis.newfeeds.domain.model.Post
import retrofit2.Response

interface PostRepository {

    fun getPost() : LiveData<Resource<ArrayList<Post>>>
}