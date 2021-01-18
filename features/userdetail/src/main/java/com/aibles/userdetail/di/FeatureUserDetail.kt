package com.aibles.userdetail.di

import com.aibles.userdetail.UserDetailViewModel
import com.aibles.userdetail.usecase.GetUserDetailUseCase
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val featureUserDetail = module {
    factory { GetUserDetailUseCase(get()) }
    viewModel { UserDetailViewModel(get(), get()) }
}