package com.river.newfeeds.domain.repository

import androidx.lifecycle.LiveData
import com.aibles.repository.utils.Resource
import com.river.newfeeds.domain.model.Post

interface PostRepository {

    fun getPost() : LiveData<Resource<ArrayList<Post>>>
}