package com.noor.abdulwahidnoor_odev1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.noor.abdulwahidnoor_odev1.databinding.FragmentSignInBinding
import com.noor.abdulwahidnoor_odev1.util.CustomPaint.setGradientColor

class SignInFragment : Fragment() {

    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignInBinding.inflate(inflater, container, false)

        initUI()

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun initUI() {
        binding.apply {
            tvForgotPassword.setGradientColor(R.color.green_start, R.color.green_end)
            btnLogin.setOnClickListener {
                editTextControl()
            }
        }
    }

    private fun editTextControl() {
        when {
            binding.etEmail.text.toString().isEmpty() -> {
                binding.etEmail.error = "Please fill in the blanks"
            }
            binding.etPassword.text.toString().isEmpty() -> {
                binding.etPassword.error = "Please fill in the blanks"
            }
            else -> {
                findNavController().navigate(SignInFragmentDirections.actionFirstFragmentToSecondFragment())
            }
        }
    }
}