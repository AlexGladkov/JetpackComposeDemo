package ru.alexgladkov.jetpackcomposedemo

import android.app.Application
import com.qonversion.android.sdk.Qonversion

@HiltAndroidApp
class JetHabbitApp : Application() {

    override fun onCreate() {
        super.onCreate()

        Qonversion.launch(
            context = this,
            key = "IVV4oWe5OWz_DJf2GZRj6Q1uD7rBn-eF",
            observeMode = false
        )
    }
}