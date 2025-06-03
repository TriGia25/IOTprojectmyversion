package com.example.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonTransactions).setOnClickListener {
            startActivity(Intent(this, TransactionHistoryActivity::class.java))
        }

        findViewById<Button>(R.id.buttonUserInfo).setOnClickListener {
            startActivity(Intent(this, UserInfoActivity::class.java))
        }
    }
}