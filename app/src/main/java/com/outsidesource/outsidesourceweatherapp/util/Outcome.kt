package com.outsidesource.outsidesourceweatherapp.util

sealed class Outcome<out T> {
    data class Ok<out T>(val value: T) : Outcome<T>()
    data class Error(val error: Any) : Outcome<Nothing>()
}