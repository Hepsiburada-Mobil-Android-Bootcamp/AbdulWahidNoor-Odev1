package com.noor.abdulwahidnoor_odev1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.noor.abdulwahidnoor_odev1.databinding.ItemMenuBinding
import com.noor.abdulwahidnoor_odev1.model.Menu

class MenuAdapter(
    private val menuList: ArrayList<Menu>
) : RecyclerView.Adapter<MenuAdapter.MenuHolder>() {

    class MenuHolder(private val binding: ItemMenuBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(menu: Menu) {
            binding.menu = menu
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuHolder {
        return MenuHolder(
            ItemMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MenuHolder, position: Int) {
        holder.bind(menuList[position])
    }

    override fun getItemCount(): Int = menuList.size

}