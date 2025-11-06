package com.example.coffeeshop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        findViewById<android.widget.TextView>(R.id.btnBuyNow).setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
        }
    }
}
