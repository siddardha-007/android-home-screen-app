package com.example.homeactivity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val choosePhotoButton = findViewById<Button>(R.id.btnChoosePhoto)
        choosePhotoButton.setOnClickListener {
            val choosePhotoIntent = Intent(Intent.ACTION_GET_CONTENT)
            choosePhotoIntent.type="image/*"
            startActivityForResult(choosePhotoIntent,0)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK && requestCode == 0){
            val uri = data?.data
            val profileImage = findViewById<ImageView>(R.id.profileImage)
            profileImage.setImageURI(uri)
        }
    }
}