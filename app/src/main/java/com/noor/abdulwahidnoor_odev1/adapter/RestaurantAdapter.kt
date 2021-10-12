package com.noor.abdulwahidnoor_odev1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.noor.abdulwahidnoor_odev1.databinding.ItemRestaurantBinding
import com.noor.abdulwahidnoor_odev1.model.Restaurant

class RestaurantAdapter(
    private val restaurantList: ArrayList<Restaurant>
) : RecyclerView.Adapter<RestaurantAdapter.RestaurantHolder>() {

    class RestaurantHolder(private val binding: ItemRestaurantBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(restaurant: Restaurant) {
            binding.apply {
                binding.restaurant = restaurant
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantHolder {
        val view = ItemRestaurantBinding.inflate(LayoutInflater.from(parent.context))
        return RestaurantHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantHolder, position: Int) {
        holder.bind(restaurantList[position])
    }

    override fun getItemCount(): Int = restaurantList.size
}