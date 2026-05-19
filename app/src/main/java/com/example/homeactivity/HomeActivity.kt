package com.example.homeactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val backButton = findViewById<Button>(R.id.btnBack)
        val profileButton = findViewById<Button>(R.id.btnProfile)

        backButton.setOnClickListener {
            finish()
        }

        profileButton.setOnClickListener {
            val profileIntent = Intent(this, ProfileActivity::class.java)
            startActivity(profileIntent)
        }
    }

}