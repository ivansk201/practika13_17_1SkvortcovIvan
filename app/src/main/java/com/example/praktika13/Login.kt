package com.example.praktika13

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.EditText

class Login : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        email = findViewById(R.id.editText)
        password = findViewById(R.id.editText2)
    }

    fun signin(view: View) {
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty())
        {
            val intent=Intent(this,Main::class.java)
            startActivity(intent)
        }
        else {
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполенные поля")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }
    }

    fun onboaridng(view: View) {
        val intent2 = Intent(this, Onboarding::class.java)
        startActivity(intent2)

    }
}