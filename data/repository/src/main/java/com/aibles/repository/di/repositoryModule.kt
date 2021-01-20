package com.aibles.repository.di

import com.aibles.repository.AppDispatchers
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module.module

val repositoryModule = module{
    factory { AppDispatchers(Dispatchers.Main, Dispatchers.IO) }
//    factory { UserRepositoryImpl(get(), get()) as UserRepository }
}