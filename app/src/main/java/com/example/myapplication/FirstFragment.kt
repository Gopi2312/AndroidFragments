package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.studentLogin.setOnClickListener {
            Log.i("Main","login click")
            val username = binding.studentUserName.text.toString()
            val password = binding.studentPassword.text.toString()
            Log.i("main",username)
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,WelcomeFragment())
                addToBackStack(null)
                commit()
            }
            binding.studentUserName.text.clear()
            binding.studentPassword.text.clear()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
