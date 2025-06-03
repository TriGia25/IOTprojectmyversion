package com.example.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*

class TransactionHistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction_history)

        val transactions = listOf("Food - $200", "Rent - $900", "Utility - $100")
        val listView = findViewById<ListView>(R.id.listViewTransactions)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, transactions)
        listView.adapter = adapter
    }
}