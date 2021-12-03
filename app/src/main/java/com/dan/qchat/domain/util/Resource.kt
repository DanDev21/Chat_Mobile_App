package com.dan.qchat.domain.util

sealed class Resource<T>(
    val data: T? = null
) {
    class Success<T>(data: T?): Resource<T>(data)
    class Error<T>(message: String? = null): Resource<T>()
}