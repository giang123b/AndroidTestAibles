package com.savis.newfeeds.view_model

import androidx.lifecycle.*
import com.aibles.repository.utils.Resource
import com.example.common.util.Event
import com.savis.newfeeds.domain.model.Post
import com.savis.newfeeds.domain.usecase.GetPostsUseCase
import io.reactivex.schedulers.Schedulers.io
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.CoroutineDispatcher
import okhttp3.Dispatcher
import okhttp3.Response

class NewFeedsViewModel(private val getPostsUseCase: GetPostsUseCase) :ViewModel(){
    private val _posts = MediatorLiveData<Resource<ArrayList<Post>>>()
    val posts: MediatorLiveData<Resource<ArrayList<Post>>> get() = _posts
    private var postsSource: LiveData<Resource<ArrayList<Post>>> = MutableLiveData()

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