package com.telkomdev.kotlinmvp.utils.common

import android.content.Context
import android.graphics.Typeface
import android.widget.TextView

object FontUtils {
    fun fontNormal(context: Context, textView: TextView){
        val type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarDreams.ttf")
        textView.setTypeface(type)
    }

    fun fontItalic(context: Context, textView: TextView){
        val type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarItalic.ttf")
        textView.setTypeface(type)
    }

    fun fontBold(context: Context, textView: TextView){
        val type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarDreamsBold.ttf")
        textView.setTypeface(type)
    }

    fun fontBoldItalic(context: Context, textView: TextView){
        val type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarDreamsBoldItalic.ttf")
        textView.setTypeface(type)
    }
}