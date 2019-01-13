package com.telkomdev.kotlinmvp.utils.extension

import android.content.Context
import android.graphics.Typeface
import android.widget.TextView


fun fontNormal(context: Context,textView:TextView){
    val type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarDreams.ttf")
    textView.setTypeface(type)
}

fun fontItalic(context: Context,textView:TextView){
    val type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarItalic.ttf")
    textView.setTypeface(type)
}

fun fontBold(context: Context,textView:TextView){
    val type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarBold.ttf")
    textView.setTypeface(type)
}

fun fontBoldItalic(context: Context,textView:TextView){
    val type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarBoldItalic.ttf")
    textView.setTypeface(type)
}
