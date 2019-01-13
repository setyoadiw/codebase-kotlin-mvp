package com.telkomdev.kotlinmvp.data.network.service

import com.telkomdev.kotlinmvp.BuildConfig
import com.telkomdev.kotlinmvp.data.network.models.LoginResponse
import io.reactivex.Single
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiEndpoint {

    @FormUrlEncoded
    @POST("api/user-signin-bypass")
    @Headers(
        "Authorization: Basic ${BuildConfig.MYINDIHOME_AUTH}"
    )
    fun login(@Field("data") data: String): Single<LoginResponse>
}