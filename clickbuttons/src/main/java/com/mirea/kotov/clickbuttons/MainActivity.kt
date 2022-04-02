package com.mirea.kotov.clickbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvOut: TextView? = findViewById(R.id.tvOut)
        val okBtn: Button? = findViewById(R.id.buttonOK)
        val CancelBtn: Button? = findViewById(R.id.buttonCancel)

        val onClickListener = okBtn?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                tvOut?.text = "Нажата кнопка ОК"
            }
        })


    }

    fun onCancelClick(view: View){
        val tvOut: TextView? = findViewById(R.id.tvOut)
        tvOut?.text = "Нажата кнопка Cancel"
    }
}