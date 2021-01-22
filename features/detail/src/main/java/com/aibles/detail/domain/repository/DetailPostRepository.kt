package com.aibles.detail.domain.repository

import androidx.lifecycle.LiveData
import com.aibles.repository.utils.Resource
import com.aibles.detail.domain.model.DetailPost

interface DetailPostRepository {

    suspend fun getPost() : LiveData<Resource<DetailPost>>
}