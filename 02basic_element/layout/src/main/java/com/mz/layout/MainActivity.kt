package com.mz.layout

import android.content.DialogInterface
import android.os.Build
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var isPaused = false

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_text_view)

        val textView = findViewById<TextView>(R.id.textview)
        /*必须使用isSelected 选中*/
        textView.isSelected = true
        textView.ellipsize = TextUtils.TruncateAt.MARQUEE
        textView.isFocusableInTouchMode = true
        textView.setSingleLine()
        textView.setOnClickListener(CustomClickListener())
        textView.setOnLongClickListener(LongTimerClickListener())


        val chatView = findViewById<TextView>(R.id.chatView)

        chatView.setOnClickListener {
            println("被点击了")
        }

    }

    /*自定义的OnClickListener*/
    inner class CustomClickListener : View.OnClickListener {
        override fun onClick(v: View?) {
            isPaused = !isPaused
            v?.isSelected = !isPaused
        }

    }

    inner class LongTimerClickListener : View.OnLongClickListener {
        override fun onLongClick(v: View?): Boolean {
            println("长时间点击")
            return true;
        }
    }
}
