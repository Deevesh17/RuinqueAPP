package com.learning.ruinque

import android.app.Application
import com.example.auth.presentation.di.authViewModelModule
import com.learning.auth.data.di.authDataModule
import com.learning.ruinque.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class RuinqueApp: Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuinqueApp)
            modules(
                authDataModule,
                authViewModelModule,
                appModule
            )
        }
    }
}