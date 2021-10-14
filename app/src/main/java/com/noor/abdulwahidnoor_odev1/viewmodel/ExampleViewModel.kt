package com.noor.abdulwahidnoor_odev1.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExampleViewModel : ViewModel() {

    val count: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>(0)
    }

}