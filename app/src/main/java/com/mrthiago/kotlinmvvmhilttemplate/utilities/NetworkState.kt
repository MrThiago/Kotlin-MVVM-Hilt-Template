package com.mrthiago.kotlinmvvmhilttemplate.utilities

sealed class NetworkState<out R> {
    data class Success<out T>(val data: T): NetworkState<T>()
    data class Error(val error: String): NetworkState<Nothing>()
    object Loading: NetworkState<Nothing>()
}