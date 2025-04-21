package com.example.dialogexamples

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val param1 = intent.getIntExtra("param0", 0)
        val param2 = intent.getFloatExtra("param2", 0f)
        val param3 = intent.getStringExtra("param3")

        val textContent = findViewById<TextView>(R.id.text_content)
        textContent.text = "$param1 - $param2 - $param3"
    }
}