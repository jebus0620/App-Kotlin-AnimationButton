package com.project.jebus.appdemobuttonanimation.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.project.jebus.appdemobuttonanimation.databinding.ActivityMainBinding
import com.project.jebus.appdemobuttonanimation.view.listener.OnClickCustomListener

class MainActivity : AppCompatActivity(), OnClickCustomListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
        loadData()
    }
    private fun initUI() {

        binding.butOption1.onClickCustomListener = this


        binding.butOption2.onClickCustomListener = this

        binding.butOption3.apply {
            setOnClickListener {
                binding.tviButton3.apply {
                    alpha = 0.2f
                    visibility = View.VISIBLE
                    animate()
                        .alpha(1f).duration = 800
                }
                binding.tviMessage.text = "Animación BUTTON Alpha Text"
            }
        }

    }

    private fun loadData(){

    }

    override fun onClick(v: View?) {
        when(v?.id){
            binding.butOption1.id -> binding.tviMessage.text = "Animación BUTTON Alpha"
            binding.butOption2.id -> binding.tviMessage.text = "Animación BUTTON Scale"
        }
    }


}