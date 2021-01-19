package com.aibles.repository.di

import com.aibles.repository.AppDispatchers
import com.aibles.repository.UserRepository
import com.aibles.repository.UserRepositoryImpl
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module.module

val repositoryModule = module{
    factory { AppDispatchers(Dispatchers.Main, Dispatchers.IO) }
//    factory { UserRepositoryImpl(get(), get()) as UserRepository }
}