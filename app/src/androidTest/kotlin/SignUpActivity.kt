package com.example.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signUpBtn = findViewById<Button>(R.id.buttonSignUp)
        signUpBtn.setOnClickListener {
            Helper.showToast(this, "Account created (mock)")
            finish()
        }
    }
}