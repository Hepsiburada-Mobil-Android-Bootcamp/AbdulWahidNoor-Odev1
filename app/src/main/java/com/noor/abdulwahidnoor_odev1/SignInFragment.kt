package com.noor.abdulwahidnoor_odev1

import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.noor.abdulwahidnoor_odev1.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignInBinding.inflate(inflater, container, false)

        binding.apply {
            tvForgotPassword.setGradientTextColor()
            btnLogin.setOnClickListener {
                editTextControl()
            }
        }

        return binding.root
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

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun TextView.setGradientTextColor() {
        val shader = LinearGradient(
            0F,
            0F,
            0F,
            lineHeight.toFloat(),
            ContextCompat.getColor(requireContext(), R.color.green_start),
            ContextCompat.getColor(requireContext(), R.color.green_end),
            Shader.TileMode.REPEAT
        )
        paint.shader = shader
    }
}