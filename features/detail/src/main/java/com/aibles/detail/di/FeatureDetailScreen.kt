package com.aibles.detail.di

import com.aibles.detail.data.remote.DetailPostDataSource
import com.aibles.detail.data.remote.DetailPostService
import com.aibles.detail.data.repository.DetailPostRepositoryImpl
import com.aibles.detail.domain.repository.DetailPostRepository
import com.aibles.detail.domain.usecase.GetDetailPostsUseCase
import com.aibles.detail.view_model.DetailPostViewModel
import org.koin.android.viewmodel.experimental.builder.viewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import retrofit2.Retrofit

val featureDetailScreen = module {
    factory { get<Retrofit>().create(DetailPostService::class.java) }
    factory { DetailPostDataSource(get()) }
    factory{
        DetailPostRepositoryImpl(get()) as DetailPostRepository
    }

    factory {
        GetDetailPostsUseCase(get())
    }
    viewModel { DetailPostViewModel(get()) }
}