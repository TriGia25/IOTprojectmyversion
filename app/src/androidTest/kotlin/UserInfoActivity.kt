package com.example.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*

class UserInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        val nameText = findViewById<TextView>(R.id.textViewName)
        val emailText = findViewById<TextView>(R.id.textViewEmail)

        nameText.text = "John Doe"
        emailText.text = "john.doe@example.com"
    }
}