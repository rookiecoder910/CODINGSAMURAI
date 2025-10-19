package com.example.supachat.model

data class UserProfile(
    val userId: String,
    val userName: String,
    val image: String = "",
)
