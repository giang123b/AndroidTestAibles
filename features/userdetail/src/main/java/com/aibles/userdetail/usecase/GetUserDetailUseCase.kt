package com.aibles.userdetail.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.aibles.model.User
import com.aibles.repository.UserRepository
import com.aibles.repository.utils.Resource

class GetUserDetailUseCase (private val repository: UserRepository) {

    suspend operator fun invoke(forceRefresh: Boolean = false, login: String): LiveData<Resource<User>> {
        return Transformations.map(repository.getUserDetail(forceRefresh, login)) {
            it // Place here your specific logic actions
        }
    }
}