package com.example.homescreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.NavHostFragment
import com.aibles.model.User
import com.aibles.repository.AppDispatchers
import com.aibles.repository.utils.Resource
import com.example.common.base.BaseViewModel
import com.example.common.util.Event
import com.example.homescreen.usecase.GetTopUsersUseCase
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeViewModel(
    private val getTopUsersUseCase: GetTopUsersUseCase,
    private val dispatchers: AppDispatchers
) :
    BaseViewModel() {

    private val _users = MediatorLiveData<Resource<List<User>>>()
    val users: LiveData<Resource<List<User>>> get() = _users
    private var usersSource: LiveData<Resource<List<User>>> = MutableLiveData()

    init {
        getUsers(false)
    }

    fun userClicksOnItem(user: User) =
        navigate(HomeFragmentDirections.actionHomeFragmentToUserDetailFragment(user.login))

    private fun getUsers(forceRefresh: Boolean) = viewModelScope.launch(dispatchers.main) {
        _users.removeSource(usersSource) // We make sure there is only one source of livedata (allowing us properly refresh)
        withContext(dispatchers.io) {
            usersSource = getTopUsersUseCase(forceRefresh = forceRefresh)
        }
        _users.addSource(usersSource) {
            _users.value = it
            if (it.status == Resource.Status.ERROR) _snackbarError.value =
                Event(R.string.error)
        }
    }

}