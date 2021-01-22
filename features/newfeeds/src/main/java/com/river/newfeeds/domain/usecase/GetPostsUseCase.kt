package com.river.newfeeds.domain.usecase

import androidx.lifecycle.LiveData
import com.aibles.repository.utils.Resource
import com.river.newfeeds.domain.model.Items
import com.river.newfeeds.domain.model.Post
import com.river.newfeeds.domain.repository.PostRepository
import retrofit2.Call
import retrofit2.Response

class GetPostsUseCase(private val postRepository: PostRepository) {

    suspend operator fun invoke(): LiveData<Resource<Items>> {
        return postRepository.getPost()
    }

}