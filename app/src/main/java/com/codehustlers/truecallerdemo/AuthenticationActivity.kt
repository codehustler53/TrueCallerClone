package com.codehustlers.truecallerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codehustlers.truecallerdemo.databinding.ActivityAuthenticationBinding

class AuthenticationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthenticationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAuthenticationBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }

}