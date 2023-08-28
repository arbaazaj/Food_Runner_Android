package com.ajf.foodrunner

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvMobile: TextView
    private lateinit var tvPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMobile = findViewById(R.id.txtMobile)
        tvPassword = findViewById(R.id.txtPassword)

        if (intent != null) {
            val mobile = intent.getStringExtra("MobileNumber")
            tvMobile.text = mobile
            val password = intent.getStringExtra("Password")
            tvPassword.text = password
        }
    }
}

