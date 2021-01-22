package com.aibles.detail.domain.usecase

import androidx.lifecycle.LiveData
import com.aibles.repository.utils.Resource
import com.aibles.detail.domain.model.DetailPost
import com.aibles.detail.domain.repository.DetailPostRepository

class GetDetailPostsUseCase(private val postRepository: DetailPostRepository) {

    suspend operator fun invoke(): LiveData<Resource<DetailPost>> {
        return postRepository.getPost()
    }

}