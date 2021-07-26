package com.codehustlers.truecallerdemo.ui.authentication.signin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.codehustlers.truecallerdemo.R
import com.codehustlers.truecallerdemo.databinding.FragmentSignInBinding

class SignInFragment: Fragment() {

    private lateinit var binding: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignInBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvMoveToSignUp.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_signInFragment_to_signUpFragment)
//            findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
        }

    }

}