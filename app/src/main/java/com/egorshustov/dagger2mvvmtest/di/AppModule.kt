package com.egorshustov.dagger2mvvmtest.di

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
object AppModule {
    @JvmStatic
    @Provides
    fun someString(): String {
        return "this is a test string"
    }

    @JvmStatic
    @Provides
    fun getApp(application: Application): Boolean {
        return application == null
    }
}