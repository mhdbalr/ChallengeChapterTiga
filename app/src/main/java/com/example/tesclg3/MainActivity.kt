package com.example.tesclg3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tesclg3.databinding.ActivityMainBinding
import com.example.tesclg3.databinding.FragmentListAbjadBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val FragmentListAbjadBinding = FragmentListAbjad()
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView, FragmentListAbjadBinding)
            .commit()
    }
}