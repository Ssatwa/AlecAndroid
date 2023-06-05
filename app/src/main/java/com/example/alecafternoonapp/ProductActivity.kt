package com.example.alecafternoonapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProductActivity : AppCompatActivity() {

    lateinit var myimage:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)


        myimage=findViewById(R.id.shirts)

        myimage.setOnClickListener {
            val myidod=Intent(this,payment::class.java)
            startActivity(myidod)
        }
    }
}