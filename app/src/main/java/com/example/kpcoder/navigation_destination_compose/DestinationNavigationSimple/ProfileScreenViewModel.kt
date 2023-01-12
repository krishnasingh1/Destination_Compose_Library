package com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class ProfileScreenViewModel @Inject constructor(savedStateHandle: SavedStateHandle) : ViewModel() {

    init {
        savedStateHandle.getLiveData<String>("id").observeForever{
            Log.d("TAG", "Id : ${it}")
        }
        savedStateHandle.getLiveData<FakeData>("fakeData").observeForever{
            Log.d("TAG", "FakeData : ${it}")
        }
    }
}