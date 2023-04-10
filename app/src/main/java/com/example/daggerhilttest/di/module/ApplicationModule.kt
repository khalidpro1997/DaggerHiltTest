package com.example.daggerhilttest.di.module

import com.example.daggerhilttest.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationModule::class)
//@InstallIn(ActivityComponent::class) if want to use ActivityComponent FragmentComponent,ServiceComponents
class ApplicationModule {


//    @Provides
//    fun provideBaseUrl() =


    @Provides
    @Singleton
    fun provideOkHttpClient() = if (BuildC.De)
}