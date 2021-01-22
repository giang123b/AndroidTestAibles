package com.river.newfeeds.view_model

import android.util.Log
import androidx.lifecycle.*
import androidx.navigation.findNavController
import com.aibles.repository.utils.Resource
import com.example.navigation.NavigationCommand
import com.river.newfeeds.domain.model.Items
import com.river.newfeeds.domain.model.Post
import com.river.newfeeds.domain.usecase.GetPostsUseCase
import com.river.newfeeds.view.ForYouAdapter
import com.river.newfeeds.view.ForYouFragment
import com.river.newfeeds.view.NewFeedsFragmentDirections
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
        }
    }

    fun openDetailPost(){
        NavigationCommand.To(NewFeedsFragmentDirections.actionNewFeedsFragmentToDetailFragment())
        Log.e("cogoi", "cogoi")
    }
}