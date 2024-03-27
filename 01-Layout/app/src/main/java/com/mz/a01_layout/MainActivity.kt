package com.mz.a01_layout

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView1)
        textView.text = "这是我的第一个安卓App"
        /*设置文本颜色*/
        textView.setTextColor(Color.RED)
        /*也可以使用这种方法来设置颜色*/
//        textView.setTextColor(Color.rgb())
        textView.textSize = 40f
    }
}