package com.telkomdev.kotlinmvp.data.network.models


data class User(
    val userid: String,
    val msisdn: String,
    val token: String,
    val email: String,
    val fullname: String,
    val gender: String,
    val profile: String,
    val city: String,
    val address: String,
    val lang: String,
    val role: String,
    val source: String,
    val tmoney: Int,
    val verified: Boolean,
    val account: String? = null
)