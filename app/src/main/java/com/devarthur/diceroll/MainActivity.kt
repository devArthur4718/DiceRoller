package com.devarthur.diceroll

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.devarthur.diceroll.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    //TODO create a view model and bind data using data binding inside layout XML

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = MainViewModel()

        binding.rollButton.text = getString(R.string.lets_roll)
        binding.rollButton.setOnClickListener {
            viewModel.rolldice()
        }

        viewModel.currentDiceResource.observe(this, Observer { imageResource ->
            binding.diceImage.setImageResource(imageResource)
        })
    }


}
