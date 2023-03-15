package com.example.praktika13

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val timer= object : CountDownTimer(3000,1000) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
val intent = Intent(this@Splash_Screen, Onboarding::class.java)
                startActivity(intent)
                finish()
            }
        }
        timer.start()
    }
}