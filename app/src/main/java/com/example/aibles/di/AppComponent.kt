package com.example.aibles.di

import com.aibles.local.di.localModule
import com.aibles.remote.di.createRemoteModule
import com.aibles.repository.di.repositoryModule
import com.aibles.userdetail.di.featureUserDetail
//import com.example.homescreen.di.featureHomeScreen
import com.example.splash.di.featureSplash
import com.river.newfeeds.di.featureNewFeedsScreen

//
val appComponent = listOf(
    createRemoteModule("https://raw.githubusercontent.com/"),
//    featureHomeScreen,
    featureSplash,
    featureUserDetail,
    featureNewFeedsScreen,
    repositoryModule,
    localModule
)