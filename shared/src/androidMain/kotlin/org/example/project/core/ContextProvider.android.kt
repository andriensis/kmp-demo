package org.example.project.core

import android.content.Context

actual class ContextProvider(private val context: Context) {
    actual fun getContext(): Any = context
}

fun getApplicationContext(): Context {
    return contextProvider.getContext() as Context
}