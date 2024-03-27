package com.mz.a02_basic_element

import android.graphics.Color
import android.os.Bundle
import android.text.Layout
import android.view.View.GONE
import android.view.View.INVISIBLE
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mz.a02_basic_element.util.DisplayUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text)
        /*第一种方式设置字体颜色*/
        textView.setTextColor(Color.RED)

        /*使用全局静态颜色文件中保存颜色设置颜色*/
        textView.setTextColor(resources.getColor(R.color.color_red_with_black));
        println(DisplayUtil.getScreenDensity(applicationContext));
        println(DisplayUtil.getScreenHeight(applicationContext));
        println(DisplayUtil.getScreenWidth(applicationContext));

        /*设置常见的属性*/
//        val layoutParams = textView.layoutParams as ViewGroup.LayoutParams
//        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT // 设置宽度为匹配父容器
//        layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT // 设置高度为包裹内容
//        textView.layoutParams = layoutParams // 应用布局参数

//        textView.minWidth = 100
//        textView.maxWidth = 200
//        textView.setBackgroundColor(resources.getColor(R.color.pink))

        /*设置可绘制对象作为背景图片*/
//        textView.setBackground(getDrawable(R.drawable.ic_launcher_foreground))

        /*设置资源ID*/
        //textView.setBackgroundResource()

        /*如果设置为Invisible的话，元素不可见，但是仍然占据空间， 如果设置为Gone的话，元素完全消失*/
//        textView.visibility  = GONE;
    }
}