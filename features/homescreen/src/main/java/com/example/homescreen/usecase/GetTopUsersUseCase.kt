package com.example.homescreen.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.aibles.model.User
import com.aibles.repository.UserRepository
import com.aibles.repository.utils.Resource

class GetTopUsersUseCase (private val repository: UserRepository) {

    suspend operator fun invoke(forceRefresh: Boolean = false): LiveData<Resource<List<User>>> {
        return Transformations.map(repository.getAllUsers(forceRefresh)) {
            it // Place here your specific logic actions
        }
    }
}