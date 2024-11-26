package com.example.instagramclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class signup_pass_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_pass_page)

        val passwordEditText: EditText = findViewById(R.id.pass)

        val button: Button = findViewById(R.id.password_next)
        button.setOnClickListener {

            val password = passwordEditText.text.toString().trim()
            if (isValidCredentials(password)) {
                val intent = Intent(this@signup_pass_page, add_phoneNo::class.java)
                startActivity(intent)
            }else {
                // Show a Snackbar or Toast indicating that credentials are invalid
                Snackbar.make(it, "Invalid credentials. Please enter Username.", Snackbar.LENGTH_SHORT).show()
            }

        }
    }

    private fun isValidCredentials(password: String): Boolean {
        return password.isNotEmpty()
    }
}