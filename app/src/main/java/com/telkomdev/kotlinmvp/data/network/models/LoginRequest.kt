package com.telkomdev.kotlinmvp.data.network.models

import com.google.gson.Gson
import java.security.MessageDigest


data class LoginRequest(
    val email: String,
    val pass: String,
    val devid: String = "ihsmart",
    val deviceType: String = "0"
) {
    private var password: String = pass

    fun asJson(): String {
        val md = MessageDigest.getInstance("MD5")
        val digested = md.digest(pass.toByteArray())
        password = digested.joinToString("") {
            String.format("%02x", it)
        }
        return Gson().toJson(this)
    }
}