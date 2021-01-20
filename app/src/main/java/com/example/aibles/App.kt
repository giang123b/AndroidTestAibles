package com.example.aibles

import android.app.Application
import com.example.aibles.di.appComponent
import org.koin.android.ext.android.startKoin

open class App : Application() {

    override fun onCreate() {
        super.onCreate()
        configureDi()
    }

    //
    open fun configureDi() = startKoin(this, provideAPI())


    open fun provideAPI() = appComponent
}