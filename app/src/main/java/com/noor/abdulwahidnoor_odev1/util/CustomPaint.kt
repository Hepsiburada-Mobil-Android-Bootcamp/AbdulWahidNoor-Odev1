package com.noor.abdulwahidnoor_odev1.util

import android.graphics.LinearGradient
import android.graphics.Shader
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.noor.abdulwahidnoor_odev1.R

object CustomPaint {

    fun TextView.setGradientColor(startColor: Int, endColor: Int) {
        val shader = LinearGradient(
            0F,
            0F,
            0F,
            height.toFloat(),
            ContextCompat.getColor(this.context, startColor),
            ContextCompat.getColor(this.context, endColor),
            Shader.TileMode.REPEAT
        )
        paint.shader = shader
    }

}