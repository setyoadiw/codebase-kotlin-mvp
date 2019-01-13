package com.telkomdev.kotlinmvp.screens.splash

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import com.telkomdev.kotlinmvp.R
import com.telkomdev.kotlinmvp.data.network.models.LoginRequest
import com.telkomdev.kotlinmvp.data.network.service.ApiClient
import com.telkomdev.kotlinmvp.screens.base.BaseActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class SplashActivity : BaseActivity() {

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val loginData = LoginRequest(email = "dimasdandi77@gmail.com", pass = "123456")

        ApiClient.getMainService()
            .login(loginData.asJson())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { response ->
                    if (response.info == "OK") {
                        Log.d("CODEBASE", "Login Successful")
                        Log.d("CODEBASE", response.user.toString())
                    } else {
                        Log.d("CODEBASE", "Login Failed")
                        // TODO: create error login constants
                        Log.d("CODEBASE", "Reason: ${response.info}")
                    }
                },
                { error -> Log.d("CODEBASE", error.message) }
            )
    }
}
