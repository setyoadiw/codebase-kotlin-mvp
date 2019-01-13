package com.telkomdev.kotlinmvp.screens.base

import android.support.annotation.StringRes

interface BaseView {

    fun showLoading()

    fun hideLoading()

    fun onError(@StringRes resId: Int)

    fun onError(message: String)

    fun showMessage(message: String)

    fun showMessage(@StringRes resId: Int)

    fun isNetworkConnected(): Boolean

    fun hideKeyboard()

}