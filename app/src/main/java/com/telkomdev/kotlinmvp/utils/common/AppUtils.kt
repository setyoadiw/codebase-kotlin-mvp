package com.telkomdev.kotlinmvp.utils.common

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import com.telkomdev.kotlinmvp.R

object AppUtils {
    fun openPlayStoreForApp(context: Context) {
        val appPackageName = context.getPackageName()
        try {
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(
                        context
                            .getResources()
                            .getString(R.string.app_market_link) + appPackageName
                    )
                )
            )
        } catch (e: ActivityNotFoundException) {
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(
                        (context
                            .getResources()
                            .getString(R.string.app_google_play_store_link) + appPackageName)
                    )
                )
            )
        }
    }

    fun belowOreoRequired():Boolean{
        return android.os.Build.VERSION.SDK_INT < 26
    }
    fun lollipopRequired():Boolean{
        return android.os.Build.VERSION.SDK_INT >= 21
    }
}