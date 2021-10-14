package com.noor.abdulwahidnoor_odev1.view

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.noor.abdulwahidnoor_odev1.R
import com.noor.abdulwahidnoor_odev1.databinding.FragmentLiveDataBinding
import com.noor.abdulwahidnoor_odev1.viewmodel.ExampleViewModel

class LiveDataFragment : Fragment() {

    private var _binding: FragmentLiveDataBinding? = null
    private val binding get() = _binding!!
    private val viewModel = ExampleViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLiveDataBinding.inflate(inflater, container, false)

        initStatusText()
        initProgressBar()
        initButtonsListener()

        return _binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun initProgressBar() {
        viewModel.count.observe(viewLifecycleOwner) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                binding.progressLinear.setProgress(it, true)
            } else {
                binding.progressLinear.progress = it
            }
        }
    }

    private fun initButtonsListener() {
        binding.btnEat.setOnClickListener {
            if (viewModel.count.value!! < 100) {
                viewModel.count.value = viewModel.count.value!! + 10
            }
        }
        binding.btnBurn.setOnClickListener {
            if (viewModel.count.value!! > 9) {
                viewModel.count.value = viewModel.count.value!! - 10
            }
        }
    }

    private fun initStatusText() {
        viewModel.count.observe(viewLifecycleOwner) {
            when (it) {
                in 0..10 -> {
                    binding.tvStatus.text = getString(R.string.starving)
                    binding.tvPercent.text = getString(R.string.hungry_percent, it)
                }
                in 10..20 -> {
                    binding.tvStatus.text = getString(R.string.very_hungry)
                    binding.tvPercent.text = getString(R.string.hungry_percent, it)
                }
                in 20..30 -> {
                    binding.tvStatus.text = getString(R.string.pretty_hungry)
                    binding.tvPercent.text = getString(R.string.hungry_percent, it)
                }
                in 30..40 -> {
                    binding.tvStatus.text = getString(R.string.starting_feel_hungry)
                    binding.tvPercent.text = getString(R.string.hungry_percent, it)
                }
                in 40..50 -> {
                    binding.tvStatus.text = getString(R.string.satisfied)
                    binding.tvPercent.text = getString(R.string.hungry_percent, it)
                }
                in 50..60 -> {
                    binding.tvStatus.text = getString(R.string.little_full)
                    binding.tvPercent.text = getString(R.string.hungry_percent, it)
                }
                in 60..70 -> {
                    binding.tvStatus.text = getString(R.string.little_uncomfortable)
                    binding.tvPercent.text = getString(R.string.hungry_percent, it)
                }
                in 70..80 -> {
                    binding.tvStatus.text = getString(R.string.feeling_stuffed)
                    binding.tvPercent.text = getString(R.string.hungry_percent, it)
                }
                in 80..90 -> {
                    binding.tvStatus.text = getString(R.string.very_uncomfortable)
                    binding.tvPercent.text = getString(R.string.hungry_percent, it)
                }
                in 90..100 -> {
                    binding.tvStatus.text = getString(R.string.so_full)
                    binding.tvPercent.text = getString(R.string.hungry_percent, it)
                }
            }
        }
    }

}