package com.example.praktika13

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
    }

    fun ONlogin(view: View) {
        val intent=Intent(this,Login::class.java)
        startActivity(intent)
    }
}