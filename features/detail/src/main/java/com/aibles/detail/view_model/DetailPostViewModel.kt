package com.aibles.detail.view_model

import android.util.Log
import androidx.lifecycle.*
import com.aibles.repository.utils.Resource
import com.aibles.detail.domain.model.DetailPost
import com.aibles.detail.domain.usecase.GetDetailPostsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DetailPostViewModel(private val getPostsUseCase: GetDetailPostsUseCase) : ViewModel() {
    init {
        getDetailPosts()
    }

    private val _detailPosts = MediatorLiveData<Resource<DetailPost>>()
    val detailPost: LiveData<Resource<DetailPost>> get() = _detailPosts
    private var postsSource: LiveData<Resource<DetailPost>> = MutableLiveData()

    private fun getDetailPosts() = viewModelScope.launch(Dispatchers.Main) {
        _detailPosts.removeSource(postsSource)
        withContext(Dispatchers.IO) {
            postsSource = getPostsUseCase()
        }
        _detailPosts.addSource(postsSource) {
            _detailPosts.value = it
            Log.e("data :", it.toString())
            Log.e("sectionType :", it.data?.sections?.get(1)?.sectionType.toString())
        }
    }
}