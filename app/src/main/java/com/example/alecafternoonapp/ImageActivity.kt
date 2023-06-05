package com.example.alecafternoonapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ImageActivity : AppCompatActivity() {

    lateinit var dog:Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        dog=findViewById(R.id.btndog)

        dog.setOnClickListener {
            val mydog=Intent(this,ProductActivity::class.java)
            startActivity(mydog)
        }
    }
}