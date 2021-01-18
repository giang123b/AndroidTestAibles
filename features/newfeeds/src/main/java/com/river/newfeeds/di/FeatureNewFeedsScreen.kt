package com.river.newfeeds.di

import com.aibles.repository.UserRepository
import com.aibles.repository.UserRepositoryImpl
import com.river.newfeeds.data.repository.PostRepositoryImpl
import com.river.newfeeds.domain.usecase.GetPostsUseCase
import com.river.newfeeds.view_model.ForYouViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val featureNewFeedsScreen = module {
    factory { GetPostsUseCase(get()) }
    viewModel { ForYouViewModel(get()) }
    factory { PostRepositoryImpl(get()) as UserRepository }
}