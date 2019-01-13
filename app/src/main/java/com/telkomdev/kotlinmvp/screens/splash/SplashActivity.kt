package com.telkomdev.kotlinmvp.screens.splash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.telkomdev.kotlinmvp.R
import com.telkomdev.kotlinmvp.screens.base.BaseActivity

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}
