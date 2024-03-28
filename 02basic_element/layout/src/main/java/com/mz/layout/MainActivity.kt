package com.mz.layout

import android.content.DialogInterface
import android.os.Build
import android.os.Bundle
import android.text.TextUtils
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var isPaused = false


    val arr = listOf("Apple", "Banana", "Orange", "Juice", "Bread")
    var index = 0;

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
        chatView.setLines(5);
        chatView.movementMethod = ScrollingMovementMethod();
        chatView.setOnClickListener {
            if (index == 0) {
                chatView.text = arr[0] + "\r\n";
            } else if(index < arr.size) {
                var temp = "";
                for (i in 0..index) {
                    temp += arr[i];
                    temp += "\r\n"
                }
                chatView.text = temp;
            }
            index++;
        }

        val longTimeClickListener = object : View.OnLongClickListener {
            override fun onLongClick(v: View?): Boolean {
                chatView.text = ""
                index =0;
                return true;
            }

            override fun onLongClickUseDefaultHapticFeedback(v: View): Boolean {
                return super.onLongClickUseDefaultHapticFeedback(v)
            }
        }
        chatView.setOnLongClickListener(longTimeClickListener);

        /* 按钮开始 */
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            findViewById<TextView>(R.id.button_below_text_view).text = "按钮被点击了"
        }

        button.setOnLongClickListener {
            findViewById<TextView>(R.id.button_below_text_view).text = "按钮被长时间点击了"
            true
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
