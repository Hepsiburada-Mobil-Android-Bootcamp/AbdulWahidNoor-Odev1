package com.noor.abdulwahidnoor_odev1.binding

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.noor.abdulwahidnoor_odev1.R

class BindMenu {

    companion object {

        @JvmStatic
        @BindingAdapter("bindMenuImage")
        fun ImageView.bindMenuImage(imageId: Int) {
            setImageResource(imageId)
        }

        @JvmStatic
        @BindingAdapter("bindMenuPrice")
        fun TextView.bindMenuPrice(price: Int) {
            text = resources.getString(R.string.price_dollar, price)
        }
    }

}