package com.ld.unittest.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ld.unittest.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_jump).setOnClickListener {
            startActivity(Intent(this, JumpActivity::class.java))
        }
        val btnChangeText = findViewById<Button>(R.id.btn_change_text)
        btnChangeText.setOnClickListener {
            btnChangeText.text = getString(R.string.unit_text_change_text_after)
        }
        findViewById<Button>(R.id.btn_jump_hot_key).setOnClickListener {
            startActivity(Intent(this, NetActivityActivity::class.java))

        }
    }
}