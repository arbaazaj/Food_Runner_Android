package com.ajf.foodrunner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var etMobileNumber: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var txtForgotPassword: TextView
    private lateinit var txtRegister: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Finding views by using id
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegister)
        btnLogin = findViewById(R.id.btnLogin)

        // Button and TextView onclick events.

        btnLogin.setOnClickListener {
            //TODO: need to complete.
        }

        // TextView on clicks.
        txtForgotPassword.setOnClickListener {
            val txtFPIntent = Intent(this@LoginActivity, ForgotPasswordActivity::class.java)
            startActivity(txtFPIntent)
        }

        txtRegister.setOnClickListener {
            val txtRegisterIntent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(txtRegisterIntent)
        }

    }
}