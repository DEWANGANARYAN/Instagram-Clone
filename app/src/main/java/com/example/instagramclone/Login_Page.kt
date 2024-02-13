package com.example.instagramclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.instagramclone.databinding.ActivityLoginPageBinding
import com.google.android.material.snackbar.Snackbar




class Login_Page : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val usernameEditText:EditText = findViewById(R.id.usernameEditText)
        val passwordEditText:EditText = findViewById(R.id.passwordEditText)


        val button:Button = findViewById(R.id.loginBtn)
        button.setOnClickListener {

            val username = usernameEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (isValidCredentials(username, password)) {
                val intent = Intent(this@Login_Page, HomeActivity::class.java)
                startActivity(intent)
            }else {
                // Show a Snackbar or Toast indicating that credentials are invalid
                Snackbar.make(it, "Invalid credentials. Please enter Username.", Snackbar.LENGTH_SHORT).show()
            }

        }


        val textView: TextView = findViewById(R.id.ClickableSignup)
        textView.setOnClickListener {
            val intent = Intent(this@Login_Page, signup_page::class.java)
            startActivity(intent)
        }

    }
    private fun isValidCredentials(username: String, password: String): Boolean {
        // Add your validation logic here
        return username.isNotEmpty() && password.isNotEmpty()
    }


}