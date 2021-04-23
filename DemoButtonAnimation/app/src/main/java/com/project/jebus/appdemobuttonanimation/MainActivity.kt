package com.project.jebus.appdemobuttonanimation

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.ViewCompat.animate
import com.project.jebus.appdemobuttonanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
        loadData()
    }
    private fun initUI() {

        binding.butOption1.setOnClickListener{
            Log.i("","")
        }
        binding.butOption1.setOnClickListener {

        }

        binding.butOption2.apply {
            setOnClickListener {
                var state = true
                apply {
                    scaleX = 1f
                    scaleY = 1f
                    animate()
                        .scaleX(1.2f)
                        .scaleY(1.2f)
                        .setDuration(100)
                        .setListener(object : Animator.AnimatorListener {
                            override fun onAnimationStart(animation: Animator?) {}
                            override fun onAnimationRepeat(animation: Animator?) {}
                            override fun onAnimationEnd(animation: Animator?) {
                                if (state) {
                                    animation.apply {
                                        scaleX = 1.2f
                                        scaleY = 1.2f
                                        animate()
                                            .scaleX(1f)
                                            .scaleY(1f).duration = 100
                                    }
                                    state = false
                                }
                            }

                            override fun onAnimationCancel(animation: Animator?) {}
                        })
                }
            }
        }

        binding.butOption3.apply {
            setOnClickListener {
                binding.tviButton3.apply {
                    alpha = 0.2f
                    visibility = View.VISIBLE
                    animate()
                        .alpha(1f).duration = 800
                }
            }
        }

    }

    private fun loadData(){

    }


}