package com.noor.abdulwahidnoor_odev1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.noor.abdulwahidnoor_odev1.databinding.ItemBannerBinding
import com.noor.abdulwahidnoor_odev1.model.Banner

class BannerAdapter(
    private val bannerList: ArrayList<Banner>
) : RecyclerView.Adapter<BannerAdapter.BannerHolder>() {

    inner class BannerHolder(val binding: ItemBannerBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(banner: Banner) {
            binding.banner = banner
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerHolder {
        return BannerHolder(
            ItemBannerBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: BannerHolder, position: Int) {
        holder.bind(bannerList[position])
    }

    override fun getItemCount(): Int = bannerList.size
}