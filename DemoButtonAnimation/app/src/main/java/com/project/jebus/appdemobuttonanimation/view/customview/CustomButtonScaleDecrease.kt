package com.project.jebus.appdemobuttonanimation.view.customview

import android.animation.Animator
import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import com.project.jebus.appdemobuttonanimation.view.listener.OnClickCustomListener

class CustomButtonScaleDecrease(context: Context, attrs: AttributeSet?) : AppCompatButton(context, attrs), View.OnClickListener {

    lateinit var onClickCustomListener: OnClickCustomListener

    init {
        setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var state = true
        apply {
            scaleX = 1f
            scaleY = 1f
            animate()
                .scaleX(0.8f)
                .scaleY(0.8f)
                .setDuration(80)
                .setListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        if (state) {
                            animation.apply {
                                scaleX = 0.8f
                                scaleY = 0.8f
                                animate()
                                    .scaleX(1f)
                                    .scaleY(1f).duration = 80
                            }
                            state = false
                        }
                        onClickCustomListener.onClick(p0)
                    }

                    override fun onAnimationCancel(animation: Animator?) {}
                })

        }
    }

}