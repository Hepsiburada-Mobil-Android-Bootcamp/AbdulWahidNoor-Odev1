package com.noor.abdulwahidnoor_odev1.util

import com.noor.abdulwahidnoor_odev1.R
import com.noor.abdulwahidnoor_odev1.model.Banner
import com.noor.abdulwahidnoor_odev1.model.Menu
import com.noor.abdulwahidnoor_odev1.model.Restaurant

object DummyData {

    fun createRestaurantList(): ArrayList<Restaurant> {
        val restaurantList = arrayListOf<Restaurant>()
        restaurantList.add(Restaurant(R.drawable.restaurant1, "Vegan Resto", "12 Min"))
        restaurantList.add(Restaurant(R.drawable.restaurant2, "Healthy Food", "8 Min"))
        restaurantList.add(Restaurant(R.drawable.restaurant1, "Vegan Resto", "12 Min"))
        restaurantList.add(Restaurant(R.drawable.restaurant2, "Healthy Food", "8 Min"))
        restaurantList.add(Restaurant(R.drawable.restaurant1, "Vegan Resto", "12 Min"))
        restaurantList.add(Restaurant(R.drawable.restaurant2, "Healthy Food", "8 Min"))
        restaurantList.add(Restaurant(R.drawable.restaurant1, "Vegan Resto", "12 Min"))
        restaurantList.add(Restaurant(R.drawable.restaurant2, "Healthy Food", "8 Min"))
        return restaurantList
    }

    fun createMenuList(): ArrayList<Menu> {
        val menuList = arrayListOf<Menu>()
        for(i in 40..44) {
            menuList.add(
                Menu(
                    R.drawable.menu1,
                    "Green Noddle",
                    i,
                    Restaurant(R.drawable.restaurant1, "Noodle House", "12 Min")
                )
            )
        }

        return menuList
    }

    fun createBannerList(): ArrayList<Banner> {
        val bannerList = arrayListOf<Banner>()
        for (i in 0..3) {
            bannerList.add(Banner(R.drawable.restaurant1))
        }
        return bannerList
    }

}