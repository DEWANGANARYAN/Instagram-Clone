package com.example.instagramclone

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class signup_page : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)

        val usernameEditText:EditText = findViewById(R.id.signup_username)

        val button: Button = findViewById(R.id.Username_next)
        button.setOnClickListener {

            val username = usernameEditText.text.toString().trim()
            if (isValidCredentials(username)) {
                val intent = Intent(this@signup_page, signup_pass_page::class.java)
                startActivity(intent)
            }else {
                // Show a Snackbar or Toast indicating that credentials are invalid
                Snackbar.make(it, "Invalid credentials. Please enter Username.", Snackbar.LENGTH_SHORT).show()
            }

        }
        }

    private fun isValidCredentials(username: String): Boolean {
        return username.isNotEmpty()
    }

}
