package com.telkomdev.kotlinmvp.data.network.models

import com.google.gson.annotations.SerializedName


data class LoginResponse(
    val code: Int,
    val guid: Int,
    val info: String,
    @SerializedName("data") val user: User? = null
)