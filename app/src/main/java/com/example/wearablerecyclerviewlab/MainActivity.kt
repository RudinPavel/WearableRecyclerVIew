package com.example.wearablerecyclerviewlab

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.wearablerecyclerviewlab.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            val intent = Intent(this, WearableRecyclerViewActivity::class.java)
            startActivity(intent)
        }
    }
}