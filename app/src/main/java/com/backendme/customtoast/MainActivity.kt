package com.backendme.customtoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast







class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)
        val btn4 = findViewById<Button>(R.id.button4)
        val btn5 = findViewById<Button>(R.id.button5)
        val btn6 = findViewById<Button>(R.id.button6)

        btn.setOnClickListener {
            Mytoast().make(this,"Please Check Your Internet Connection!",Toast.LENGTH_SHORT,"#f44336",null,R.drawable.ic_warning_black_24dp).show()
        }
        btn2.setOnClickListener {
            Mytoast().make(this,"There is a problem with your internet connection! ",Toast.LENGTH_SHORT,"#03A9F4",null,R.drawable.ic_perm_scan_wifi_black_24dp).show()
        }
        btn3.setOnClickListener {
            Mytoast().make(this,"New Contact Added!",Toast.LENGTH_SHORT,"#FF5722",null,R.drawable.ic_add_circle_outline_black_24dp).show()
        }
        btn4.setOnClickListener {
            Mytoast().make(this,"Your Text, Copied To Clipboard!",Toast.LENGTH_SHORT,"#4CAF50",null,R.drawable.ic_content_copy_black_24dp).show()
        }
        btn5.setOnClickListener {
            Mytoast().make(this,"This is a toast with yellow background color & with black text color",Toast.LENGTH_SHORT,"#FFEB3B","#000000",null).show()
        }
        btn6.setOnClickListener {
            Mytoast().make(this,"This is a toast with gold background color & with black text color",Toast.LENGTH_SHORT,"#CFB53B","#000000",null).show()
        }
    }



}
