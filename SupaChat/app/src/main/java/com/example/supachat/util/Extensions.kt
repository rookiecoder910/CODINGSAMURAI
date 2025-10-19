package com.example.supachat.util

import kotlinx.coroutines.tasks.await

suspend fun <T> com.google.android.gms.tasks.Task<T>.awaitResult(): T = await()