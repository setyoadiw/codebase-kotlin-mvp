package com.telkomdev.kotlinmvp.screens.onboard

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class OnBoardAdapter(private val mLayout:IntArray, private val context: Context) : PagerAdapter(){
    private var mInflater: LayoutInflater? = null

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as View
    }

    override fun getCount(): Int {
        return mLayout.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        mInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater?
        val view = if (true) mInflater?.inflate(mLayout[position], container, false) else null
        container.addView(view)
        return view!!
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view = `object` as View
        container.removeView(view)
    }
}