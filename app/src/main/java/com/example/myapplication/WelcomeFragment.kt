package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.myapplication.databinding.FragmentFirstBinding
import com.example.myapplication.databinding.WelcomFragmentBinding

class WelcomeFragment: Fragment(R.layout.welcom_fragment) {

    private val viewModel : LoginViewModel by viewModels()
    private var _binding : WelcomFragmentBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = WelcomFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("welcome",viewModel.userName.toString())
        if (!viewModel.userName.isNullOrEmpty()) {
            binding.welcomeText.text = "Welcome Back ${viewModel.userName}"
        } else {
            binding.welcomeText.text = "Welcome"
        }
    }
}