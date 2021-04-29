package com.pavelzhuchkov1.api_level_checker

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val version : Int = android.os.Build.VERSION.SDK_INT
        val tvVersion : TextView = findViewById(R.id.tv_version)

        findViewById<Button>(R.id.button)?.apply{
            setOnClickListener{
                tvVersion.text = "Api level: $version"
            }
        }
    }
}