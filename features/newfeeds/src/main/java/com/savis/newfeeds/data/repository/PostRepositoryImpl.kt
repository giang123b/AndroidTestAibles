package com.savis.newfeeds.data.repository

import androidx.lifecycle.LiveData
import com.aibles.repository.utils.Resource
import com.savis.newfeeds.data.remote.PostAPIClient
import com.savis.newfeeds.domain.model.Post
import com.savis.newfeeds.domain.repository.PostRepository
import retrofit2.Response

class PostRepositoryImpl (private val postAPIClient: PostAPIClient):PostRepository {
    override fun getPost(): LiveData<Resource<ArrayList<Post>>> {
//        val apiInterface = PostAPIClient.getPost()?.create(PostInterface::class.java)
        return postAPIClient.getPost.getPost()
    }
}