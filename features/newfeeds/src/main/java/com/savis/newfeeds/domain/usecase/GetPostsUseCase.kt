package com.savis.newfeeds.domain.usecase

import android.telecom.Call
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.aibles.model.User
import com.aibles.repository.utils.Resource
import com.savis.newfeeds.data.repository.PostRepositoryImpl
import com.savis.newfeeds.domain.model.Post
import com.savis.newfeeds.domain.repository.PostRepository
import retrofit2.Response

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