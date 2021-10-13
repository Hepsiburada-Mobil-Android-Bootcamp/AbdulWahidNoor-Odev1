package com.noor.abdulwahidnoor_odev1.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter

class BindRestaurant {
    companion object {

        @JvmStatic
        @BindingAdapter("bindRestaurantImage")
        fun ImageView.bindImage(imageId: Int) {
            setImageResource(imageId)
        }
    }
}