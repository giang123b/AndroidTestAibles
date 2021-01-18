package com.river.newfeeds.domain.usecase

import androidx.lifecycle.LiveData
import com.aibles.repository.utils.Resource
import com.river.newfeeds.data.repository.PostRepositoryImpl
import com.river.newfeeds.domain.model.Post

class GetPostsUseCase(private val postRepositoryImpl: PostRepositoryImpl) {
    suspend operator fun invoke(): LiveData<Resource<ArrayList<Post>>> {
        return postRepositoryImpl.getPost()
    }

//    suspend operator fun invoke(forceRefresh: Boolean = false): LiveData<Resource<List<User>>> {
//        return Transformations.map(repository.getAllUsers(forceRefresh)) {
//            it // Place here your specific logic actions
//        }
//    }
}