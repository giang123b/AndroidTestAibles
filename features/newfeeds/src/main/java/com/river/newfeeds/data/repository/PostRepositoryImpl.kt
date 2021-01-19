package com.river.newfeeds.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.aibles.model.User
import com.aibles.repository.utils.NetworkBoundResource
import com.aibles.repository.utils.Resource
import com.river.newfeeds.domain.model.Post
import com.river.newfeeds.data.remote.PostDataSource
import com.river.newfeeds.domain.model.Items
import com.river.newfeeds.domain.repository.PostRepository
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.Response

class PostRepositoryImpl (private val postDataSource: PostDataSource): PostRepository {
    override suspend fun getPost(): LiveData<Resource<Items>> {
        val liveData = MutableLiveData<Resource<Items>>()
        val response = postDataSource.getPosts()
        if (response.isSuccessful) {
            liveData.postValue(Resource.success(response.body()))
        } else {
            liveData.postValue(Resource.error(Throwable(), null))
        }
        return liveData
        // tutu banj oi
            // cai List<Post> nay bay gio sua thanh Items chu?
        // vi toi sua no roi - ok b
    }

//    override suspend fun getPost(): Call<Resource<Items>> {
//
//        return postDataSource.getPosts()
//    }
}