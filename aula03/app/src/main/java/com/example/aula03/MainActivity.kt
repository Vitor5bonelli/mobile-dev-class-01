package com.example.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}