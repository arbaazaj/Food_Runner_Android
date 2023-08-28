package com.ajf.foodrunner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var etMobileNumber: EditText
    private lateinit var etEmail: EditText
    private lateinit var btnResetPassword: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etEmail = findViewById(R.id.etEmail)
        btnResetPassword = findViewById(R.id.btnResetPassword)
        btnResetPassword.setOnClickListener {
            val mobileNumber = etMobileNumber.text.toString()
            val email = etEmail.text.toString()

            if (mobileNumber.isNotEmpty() && email.isNotEmpty()) {
                val intent = Intent(this@ForgotPasswordActivity, MainActivity::class.java)
                intent.putExtra("MobileNumber", mobileNumber)
                intent.putExtra("Email", email)
                startActivity(intent)
                etMobileNumber.text.clear()
                etEmail.text.clear()
            } else {
                Toast.makeText(
                    this@ForgotPasswordActivity,
                    "Please enter credentials",
                    Toast.LENGTH_LONG
                )
                    .show()
            }
        }
    }
}