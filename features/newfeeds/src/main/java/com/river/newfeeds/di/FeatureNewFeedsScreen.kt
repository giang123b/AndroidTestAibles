package com.river.newfeeds.di

import com.river.newfeeds.data.remote.PostDataSource
import com.river.newfeeds.data.remote.PostService
import com.river.newfeeds.data.repository.PostRepositoryImpl
import com.river.newfeeds.domain.repository.PostRepository
import com.river.newfeeds.domain.usecase.GetPostsUseCase
import com.river.newfeeds.view_model.ForYouViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import retrofit2.Retrofit

val featureNewFeedsScreen = module {
    factory { get<Retrofit>().create(PostService::class.java) }
    factory { PostDataSource(get()) }
    factory{
        PostRepositoryImpl(get()) as PostRepository}

    factory {
        GetPostsUseCase(get())
    }
    viewModel { ForYouViewModel(get()) }
}