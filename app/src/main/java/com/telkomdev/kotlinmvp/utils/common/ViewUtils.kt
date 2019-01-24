package com.telkomdev.kotlinmvp.utils.common

import android.content.Context
import android.content.res.Resources
import android.graphics.PorterDuff
import android.support.v4.content.ContextCompat
import android.graphics.drawable.Drawable
import com.telkomdev.kotlinmvp.R


object ViewUtils {
    fun pxToDp(px: Float): Float {
        val densityDpi = Resources.getSystem().getDisplayMetrics().densityDpi
        return px / (densityDpi / 160f)
    }

    fun dpToPx(dp: Float): Int {
        val density = Resources.getSystem().getDisplayMetrics().density
        return Math.round(dp * density)
    }

    fun changeIconDrawableToGray(context: Context, drawable: Drawable?) {
        if (drawable != null) {
            drawable.mutate()
            drawable.setColorFilter(
                ContextCompat
                    .getColor(context, R.color.icon_off), PorterDuff.Mode.SRC_ATOP
            )
        }
    }
}