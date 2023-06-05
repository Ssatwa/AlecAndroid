package com.example.alecafternoonapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FormActivity : AppCompatActivity() {

    lateinit var feedback: Button
    lateinit var pay: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        feedback=findViewById(R.id.btn4)
        pay=findViewById(R.id.BtnPay)

        feedback.setOnClickListener {
            var myfeed=Intent(this,FeedActivity::class.java)
            startActivity(myfeed)
        }

        pay.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
    }
}