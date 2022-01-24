package com.example.domain.entity


data class Json4KotlinBase(

    val success: Boolean,
    val code: Int,
    val data: List<ConferenceData>,
    val count: Int,
    val errorMessage: String
)