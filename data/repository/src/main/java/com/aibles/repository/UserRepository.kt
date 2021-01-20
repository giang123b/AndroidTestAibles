package com.aibles.repository

import androidx.lifecycle.LiveData
import com.aibles.local.dao.UserDao
import com.aibles.model.User
import com.aibles.remote.UserDataSource
import com.aibles.repository.utils.NetworkBoundResource
import com.aibles.repository.utils.Resource
import kotlinx.coroutines.Deferred


interface UserRepository {
    suspend fun getAllUsers(forceRefresh: Boolean = false): LiveData<Resource<List<User>>>
    suspend fun getUserDetail(
        forceRefresh: Boolean = false,
        login: String
    ): LiveData<Resource<User>>
}

class UserRepositoryImpl(
    private val dataSource: UserDataSource,
    private val dao: UserDao
) : UserRepository {

    override suspend fun getAllUsers(forceRefresh: Boolean): LiveData<Resource<List<User>>> {
        return object : NetworkBoundResource<List<User>, List<User>>() {

            override fun processResponse(response: List<User>): List<User> = response

            override suspend fun saveCallResults(items: List<User>) = dao.save(items)

            override fun shouldFetch(data: List<User>?): Boolean =
                data == null || data.isEmpty() || forceRefresh

            override suspend fun loadFromDb(): List<User> = dao.getTopUsers()

            override fun createCallAsync(): Deferred<List<User>> =
                dataSource.getAllUsers()

        }.build().asLiveData()
    }

    override suspend fun getUserDetail(forceRefresh: Boolean, login: String): LiveData<Resource<User>> {
        return object : NetworkBoundResource<User, User>() {

            override fun processResponse(response: User): User
                    = response

            override suspend fun saveCallResults(item: User)
                    = dao.save(item)

            override fun shouldFetch(data: User?): Boolean
                    = data == null
                    || data.haveToRefreshFromNetwork()
                    || data.name.isNullOrEmpty()
                    || forceRefresh

            override suspend fun loadFromDb(): User
                    = dao.getUser(login)

            override fun createCallAsync(): Deferred<User>
                    = dataSource.getUserDetail(login)

        }.build().asLiveData()
    }
}