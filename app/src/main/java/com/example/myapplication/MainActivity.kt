package com.example.myapplication

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatViewInflater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bartImage = findViewById<ImageView>(R.id.bartImage) as ImageView;
        var homerImageView = findViewById<ImageView>(R.id.homerImage)

        bartImage.x = -1000f;

        bartImage.animate().translationXBy(1000f).rotation(3600f).setDuration(3000L)
        var isBart: Boolean = true;

        findViewById<ImageView>(R.id.bartImage).setOnClickListener {


            if (isBart) {
                bartImage.animate().scaleX(0.5f).scaleY(0.5f).rotation(1800f).alpha(0f).setDuration(3000L);
                homerImageView.animate().scaleX(0.5f).scaleY(0.5f).rotation(3600f).alpha(1f).setDuration(3000L);
                isBart = false;
            } else {
                homerImageView.animate().scaleX(1f).scaleY(1f).rotation(1800f).alpha(0f).setDuration(3000L);
                bartImage.animate().scaleX(1f).scaleY(1f).rotation(3600f).alpha(1f).setDuration(3000L);
                isBart = true;

            }
        }

    }
}








