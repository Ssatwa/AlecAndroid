package com.example.alecafternoonapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FeedActivity : AppCompatActivity() {
    lateinit var intent: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        intent=findViewById(R.id.btnInt)

        intent.setOnClickListener {
            var myInt= Intent(this,IntentActivity::class.java)
            startActivity(myInt)
        }

    }
}