package com.mirea.kotov.layouttype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val myTextView: TextView? = findViewById(R.id.textView)
        myTextView?.text = "New text in MIREA"
        val myButton: Button? = findViewById(R.id.button10)
        myButton?.text = "Mirea First Button"
        val myCheckBox: CheckBox? = findViewById(R.id.checkBox)
        myCheckBox?.isChecked = true
    }
}