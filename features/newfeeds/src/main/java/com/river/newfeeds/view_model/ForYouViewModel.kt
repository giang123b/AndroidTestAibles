package com.river.newfeeds.view_model

import androidx.lifecycle.*
import com.aibles.repository.utils.Resource
import com.river.newfeeds.domain.model.Post
import com.river.newfeeds.domain.usecase.GetPostsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ForYouViewModel(private val getPostsUseCase: GetPostsUseCase) : ViewModel() {
    private val _posts = MediatorLiveData<Resource<ArrayList<Post>>>()
    val posts: MediatorLiveData<Resource<ArrayList<Post>>> get() = _posts
    private var postsSource: LiveData<Resource<ArrayList<Post>>> = MutableLiveData()

    init {
        getPosts()
    }

    fun getPosts() = viewModelScope.launch() {
        _posts.removeSource(postsSource)
        withContext(Dispatchers.IO) {
            postsSource = getPostsUseCase()
        }
        _posts.addSource(postsSource) {
            _posts.value = it
        }
    }
}