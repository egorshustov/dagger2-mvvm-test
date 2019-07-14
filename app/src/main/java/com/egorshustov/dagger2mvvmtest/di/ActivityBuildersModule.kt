package com.egorshustov.dagger2mvvmtest.di

import com.egorshustov.dagger2mvvmtest.AuthActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeAuthActivity(): AuthActivity

    @Module
    companion object {
        @JvmStatic
        @Provides
        fun someString(): String {
            return "this is a test string"
        }
    }
}