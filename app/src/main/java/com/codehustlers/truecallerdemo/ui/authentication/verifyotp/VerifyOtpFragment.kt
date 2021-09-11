package com.codehustlers.truecallerdemo.ui.authentication.verifyotp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codehustlers.truecallerdemo.databinding.FragmentVerifyOtpBinding

class VerifyOtpFragment: Fragment() {


    private lateinit var binding: FragmentVerifyOtpBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVerifyOtpBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }

}