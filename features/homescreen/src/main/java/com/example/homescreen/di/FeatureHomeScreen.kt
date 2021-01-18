package com.example.homescreen.di

import com.example.homescreen.HomeViewModel
import com.example.homescreen.usecase.GetTopUsersUseCase
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val featureHomeScreen = module {
    factory { GetTopUsersUseCase(get()) }
    viewModel { HomeViewModel(get(), get()) }
}