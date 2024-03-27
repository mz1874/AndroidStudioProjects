package com.mz.a02_basic_element.util

import android.content.Context
import android.util.DisplayMetrics
import android.view.WindowManager

/**
 * @desc  工具类, 获取当前屏幕的大小 和像素密度 及 1DP = density个像素
 * 同一个屏幕 只要DP 一致 那么显示的效果一致， 改变手机字体大小不会改变dp
 * 如果需要改变的话需要设置像素单位为 sp
 * @author WangChong
 */
class DisplayUtil {
    companion object {
        fun getScreenWidth(context: Context): Int {
            val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val displayMetrics = DisplayMetrics()
            windowManager.defaultDisplay.getMetrics(displayMetrics)
            return displayMetrics.widthPixels
        }

        fun getScreenHeight(context: Context): Int {
            val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val displayMetrics = DisplayMetrics()
            windowManager.defaultDisplay.getMetrics(displayMetrics)
            return displayMetrics.heightPixels
        }

        fun getScreenDensity(context: Context): Float {
            val displayMetrics = DisplayMetrics()
            val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            windowManager.defaultDisplay.getMetrics(displayMetrics)
            return displayMetrics.density
        }
    }
}
