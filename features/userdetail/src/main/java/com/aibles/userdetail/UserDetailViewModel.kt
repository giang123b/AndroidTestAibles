package com.aibles.userdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.NavHostFragment
import com.aibles.model.User
import com.aibles.repository.AppDispatchers
import com.aibles.repository.utils.Resource
import com.aibles.repository.utils.Resource.Companion.error
import com.aibles.userdetail.usecase.GetUserDetailUseCase
import com.example.common.base.BaseViewModel
import com.example.common.util.Event
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class UserDetailViewModel(
    private val getUserDetailUseCase: GetUserDetailUseCase,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private lateinit var argsLogin: String
    private var userSource: LiveData<Resource<User>> = MutableLiveData()
    private val _user = MediatorLiveData<User>()
    val user: LiveData<User> get() = _user

    fun loadDataWhenActivityStarts(login: String) {
        argsLogin = login
        getUserDetail(false)
    }

    private fun getUserDetail(forceRefresh: Boolean) = viewModelScope.launch(dispatchers.main) {
        _user.removeSource(userSource)
        withContext(dispatchers.io) {
            userSource = getUserDetailUseCase(forceRefresh = forceRefresh, login = argsLogin)
        }
        _user.addSource(userSource) {
            _user.value = it.data
            if (it.status == Resource.Status.ERROR) _snackbarError.value = Event(R.string.error)
        }
    }
}