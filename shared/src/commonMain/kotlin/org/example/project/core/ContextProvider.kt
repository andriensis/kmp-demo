package org.example.project.core

expect class ContextProvider {
    fun getContext(): Any
}

lateinit var contextProvider: ContextProvider