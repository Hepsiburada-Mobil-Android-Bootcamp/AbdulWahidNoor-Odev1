package com.noor.abdulwahidnoor_odev1.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter

class BindBanner {

    companion object {

        @JvmStatic
        @BindingAdapter("bindBanner")
        fun ImageView.bindBanner(imageId: Int) {
            setImageResource(imageId)
        }
    }
}