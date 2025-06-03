import android.content.Context
import android.util.Patterns
import android.widget.Toast
package com.example.app

object Helper {
    fun validateEmail(email: String): Boolean =
        android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}