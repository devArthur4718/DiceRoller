package com.devarthur.diceroll

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

//* Created by Arthur Gomes at 25/12/19 16:35 - contact me at devarthur4718@gmail.com.br
class MainViewModel : ViewModel() {

    init {

    }

    private val _currentDiceResource = MutableLiveData<Int>()
    val currentDiceResource : LiveData<Int>
        get() = _currentDiceResource

    fun rolldice() {

        val randomInt = Random.nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        _currentDiceResource.value = drawableResource
    }

    fun viewToast(){
        Log.i("ViewModel", "Action called")
    }
}