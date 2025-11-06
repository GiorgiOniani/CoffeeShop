package com.example.coffeeshop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        findViewById<android.widget.TextView>(R.id.btnGetStarted).setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}
