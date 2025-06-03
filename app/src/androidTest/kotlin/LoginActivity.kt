package com.example.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailInput = findViewById<EditText>(R.id.editTextEmail)
        val passwordInput = findViewById<EditText>(R.id.editTextPassword)
        val loginBtn = findViewById<Button>(R.id.buttonLogin)

        loginBtn.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            if (Helper.validateEmail(email) && password.isNotEmpty()) {
                startActivity(Intent(this, MainActivity::class.java))
            } else {
                Helper.showToast(this, "Invalid credentials")
            }
        }
    }
}