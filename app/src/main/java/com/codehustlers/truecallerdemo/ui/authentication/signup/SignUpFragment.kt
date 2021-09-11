package com.codehustlers.truecallerdemo.ui.authentication.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.codehustlers.truecallerdemo.R
import com.codehustlers.truecallerdemo.databinding.FragmentSignInBinding
import com.codehustlers.truecallerdemo.databinding.FragmentSignUpBinding

class SignUpFragment: Fragment() {

    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvSignInBtn.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_signUpFragment_to_verifyOtpFragment)
        }

    }

}