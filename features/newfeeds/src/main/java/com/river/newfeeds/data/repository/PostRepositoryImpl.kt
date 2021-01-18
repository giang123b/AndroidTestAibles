package com.river.newfeeds.data.repository

import androidx.lifecycle.LiveData
import com.aibles.repository.utils.Resource
import com.river.newfeeds.data.remote.PostAPIClient
import com.river.newfeeds.domain.model.Post
import com.river.newfeeds.domain.repository.PostRepository

class PostRepositoryImpl (private val postAPIClient: PostAPIClient):PostRepository {
    override fun getPost(): LiveData<Resource<ArrayList<Post>>> {
//        val apiInterface = PostAPIClient.getPost()?.create(PostInterface::class.java)
        return postAPIClient.getPost.getPost()
    }
}