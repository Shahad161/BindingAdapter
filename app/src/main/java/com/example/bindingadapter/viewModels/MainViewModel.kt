package com.example.bindingadapter.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class MainViewModel: ViewModel() {
    private var _myLiveData = MutableLiveData("Hi")
    val myLiveData: LiveData<String>
            get() = _myLiveData

    init{
        flow {
            emit(_myLiveData.value)
            delay(2000)
        }
    }
}