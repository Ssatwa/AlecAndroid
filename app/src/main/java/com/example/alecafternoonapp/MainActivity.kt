package com.example.alecafternoonapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//Declaring variables
    lateinit var toastbutton:Button
    lateinit var toastbutton2:Button
    lateinit var myform:Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//finding view by ID
        toastbutton=findViewById(R.id.btn1)
        myform=findViewById(R.id.btn3)

        toastbutton.setOnClickListener {
            Toast.makeText(applicationContext,"You did it successfully",Toast.LENGTH_LONG).show()
        }

        toastbutton2=findViewById(R.id.btn2)

        toastbutton2.setOnClickListener {
            Toast.makeText(applicationContext,"You successfully logged in",Toast.LENGTH_LONG).show()
        }

        myform.setOnClickListener {
            Toast.makeText(applicationContext,"You are in",Toast.LENGTH_LONG).show()
            var form=Intent(this,FormActivity::class.java)
            startActivity(form)
        }
    }
}