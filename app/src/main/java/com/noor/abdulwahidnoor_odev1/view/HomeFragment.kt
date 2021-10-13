package com.noor.abdulwahidnoor_odev1.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.noor.abdulwahidnoor_odev1.adapter.MenuAdapter
import com.noor.abdulwahidnoor_odev1.adapter.RestaurantAdapter
import com.noor.abdulwahidnoor_odev1.databinding.FragmentHomeBinding
import com.noor.abdulwahidnoor_odev1.util.DummyData.createMenuList
import com.noor.abdulwahidnoor_odev1.util.DummyData.createRestaurantList

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        initRecyclerViews()


        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun initRecyclerViews() {
        binding.rvRestaurant.adapter = RestaurantAdapter(createRestaurantList())
        binding.rvRestaurant.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rvMenu.adapter = MenuAdapter(createMenuList())
        binding.rvMenu.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
    }
}