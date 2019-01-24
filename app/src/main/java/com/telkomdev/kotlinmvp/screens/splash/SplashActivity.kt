package com.telkomdev.kotlinmvp.screens.splash

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import com.telkomdev.kotlinmvp.R
import com.telkomdev.kotlinmvp.data.network.models.LoginRequest
import com.telkomdev.kotlinmvp.data.network.service.ApiClient
import com.telkomdev.kotlinmvp.screens.base.BaseActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : BaseActivity() {

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        tv_disable_filled.setOnClickListener {
            if (tv_disable_filled.text.equals("Disable it")){
                btn_filled.isEnabled = false
                tv_disable_filled.text = "Enable it"
            }else if (tv_disable_filled.text.equals("Enable it")){
                btn_filled.isEnabled = true
                tv_disable_filled.text = "Disable it"
            }
        }

        tv_disable_filled_left.setOnClickListener {
            if (tv_disable_filled_left.text.equals("Disable it")){
                btn_filled_left_icon.isEnabled = false
                tv_disable_filled_left.text = "Enable it"
            }else if (tv_disable_filled_left.text.equals("Enable it")){
                btn_filled_left_icon.isEnabled = true
                tv_disable_filled_left.text = "Disable it"
            }
        }

        tv_disable_filled_right.setOnClickListener {
            if (tv_disable_filled_right.text.equals("Disable it")){
                btn_filled_right_icon.isEnabled = false
                tv_disable_filled_right.text = "Enable it"
            }else if (tv_disable_filled_right.text.equals("Enable it")){
                btn_filled_right_icon.isEnabled = true
                tv_disable_filled_right.text = "Disable it"
            }
        }

        tv_show_loading.setOnClickListener {
            if (progressbar_btn_loading.visibility==View.GONE){
                progressbar_btn_loading.visibility = View.VISIBLE
                btn_filled_loading.text = null
                tv_show_loading.text = "Close loading"
            }else{
                if (progressbar_btn_loading.visibility==View.VISIBLE){
                    progressbar_btn_loading.visibility = View.GONE
                    btn_filled_loading.text = "Loading Filled Button"
                    tv_show_loading.text = "Show loading"
                }
            }
        }

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
