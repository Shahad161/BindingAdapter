package com.example.bindingadapter.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class MainViewModel: ViewModel() {
    var myLiveData = MutableLiveData<String>()

    init{
        flow {
            emit(myLiveData.value)
            delay(2000)
        }
    }
}