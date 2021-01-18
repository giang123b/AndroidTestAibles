package com.aibles.local.di

import com.aibles.local.AiblesAppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

private const val DATABASE = "DATABASE"

val localModule = module {

    single(DATABASE) { AiblesAppDatabase.buildDatabase(androidContext()) }

    factory { (get(DATABASE) as AiblesAppDatabase).userDao() }
}