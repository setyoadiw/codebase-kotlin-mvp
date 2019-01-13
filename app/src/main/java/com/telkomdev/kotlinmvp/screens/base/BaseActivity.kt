package com.telkomdev.kotlinmvp.screens.base

import android.support.v7.app.AppCompatActivity
import android.app.ProgressDialog
import android.content.Context.INPUT_METHOD_SERVICE
import android.support.annotation.StringRes
import android.widget.Toast
import android.support.v4.content.ContextCompat
import android.widget.TextView
import android.R.string.cancel
import android.content.pm.PackageManager
import android.os.Build
import android.annotation.TargetApi
import android.content.Context
import android.view.inputmethod.InputMethodManager
import com.telkomdev.kotlinmvp.R
import com.telkomdev.kotlinmvp.utils.common.NetworkUtils


abstract class BaseActivity : AppCompatActivity(), BaseView {

    @TargetApi(Build.VERSION_CODES.M)
    fun requestPermissionsSafely(permissions: Array<String>, requestCode: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(permissions, requestCode)
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    fun hasPermission(permission: String): Boolean {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.M || checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED
    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError(message: String) {

    }

    override fun onError(@StringRes resId: Int) {

        onError(getString(resId))
    }

    override fun showMessage(message: String) {

    }

    override fun showMessage(@StringRes resId: Int) {
        showMessage(getString(resId))
    }

    override fun isNetworkConnected(): Boolean {
        return NetworkUtils.isNetworkConnected(applicationContext)
    }

    fun onFragmentAttached() {

    }

    fun onFragmentDetached(tag: String) {

    }

    override fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

}