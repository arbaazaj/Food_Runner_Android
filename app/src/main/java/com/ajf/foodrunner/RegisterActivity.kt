package com.ajf.foodrunner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etMobileNumber: EditText
    private lateinit var etAddress: EditText
    private lateinit var etPassword: EditText
    private lateinit var etConfirmPassword: EditText
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etAddress = findViewById(R.id.etAddress)
        etPassword = findViewById(R.id.etPassword)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val mobileNumber = etMobileNumber.text.toString()
            val address = etAddress.text.toString()
            val password = etPassword.text.toString()
            val confirmPassword = etConfirmPassword.text.toString()

            if (mobileNumber.isNotEmpty() && password.isNotEmpty() && name.isNotEmpty() && email.isNotEmpty() && address.isNotEmpty() && confirmPassword.isNotEmpty()) {
                val intentRegister = Intent(this@RegisterActivity, MainActivity::class.java)
                intentRegister.putExtra("Name", name)
                intentRegister.putExtra("Email", email)
                intentRegister.putExtra("MobileNumber", mobileNumber)
                intentRegister.putExtra("Address", address)
                intentRegister.putExtra("Password", password)
                intentRegister.putExtra("ConfirmPassword", confirmPassword)
                startActivity(intentRegister)
                etName.text.clear()
                etEmail.text.clear()
                etMobileNumber.text.clear()
                etAddress.text.clear()
                etPassword.text.clear()
                etConfirmPassword.text.clear()
            } else {
                Toast.makeText(this@RegisterActivity, "Please enter credentials", Toast.LENGTH_LONG)
                    .show()
            }
        }

    }
}