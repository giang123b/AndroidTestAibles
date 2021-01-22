package com.aibles.detail.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.aibles.repository.utils.Resource
import com.aibles.detail.domain.repository.DetailPostRepository
import com.aibles.detail.data.remote.DetailPostDataSource
import com.aibles.detail.domain.model.DetailPost

class DetailPostRepositoryImpl (private val detailPostDataSource: DetailPostDataSource): DetailPostRepository {
    override suspend fun getPost(): LiveData<Resource<DetailPost>> {
        val liveData = MutableLiveData<Resource<DetailPost>>()
        val response = detailPostDataSource.getDetailPosts()
        if (response.isSuccessful) {
            liveData.postValue(Resource.success(response.body()))
        } else {
            liveData.postValue(Resource.error(Throwable(), null))
        }
        return liveData
    }

}