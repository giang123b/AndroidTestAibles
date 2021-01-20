package com.river.newfeeds.view_model

import android.util.Log
import androidx.lifecycle.*
import com.aibles.repository.utils.Resource
import com.river.newfeeds.domain.model.Items
import com.river.newfeeds.domain.model.Post
import com.river.newfeeds.domain.usecase.GetPostsUseCase
import com.river.newfeeds.view.ForYouAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ForYouViewModel(private val getPostsUseCase: GetPostsUseCase) : ViewModel() {
    init {
        getPosts()
    }

    private val _posts = MediatorLiveData<Resource<Items>>()
    val posts: LiveData<Resource<Items>> get() = _posts
    private var postsSource: LiveData<Resource<Items>> = MutableLiveData()

    private fun getPosts() = viewModelScope.launch(Dispatchers.Main) {
        _posts.removeSource(postsSource)
        withContext(Dispatchers.IO) {
            postsSource = getPostsUseCase()
        }
        _posts.addSource(postsSource) {
            _posts.value = it
            Log.e("data :", it.toString())
            Log.e("Image :", it.data?.items?.get(1)?.images.toString())
        }
    }
}