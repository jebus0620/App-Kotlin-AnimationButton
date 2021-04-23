package com.project.jebus.appdemobuttonanimation.view.customview

import android.animation.Animator
import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import com.project.jebus.appdemobuttonanimation.view.listener.OnClickCustomListener

class CustomButtonAlpha(context: Context, attrs: AttributeSet?) : AppCompatButton(context, attrs), View.OnClickListener {

    lateinit var onClickCustomListener: OnClickCustomListener

    init {
        setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        apply {
            alpha = 0.2f
            visibility = View.VISIBLE
            animate()
                    .alpha(1f)
                    .setDuration(500)
                    .setListener(object : Animator.AnimatorListener {
                        override fun onAnimationStart(animation: Animator?) {}
                        override fun onAnimationRepeat(animation: Animator?) {}
                        override fun onAnimationEnd(animation: Animator?) {
                            onClickCustomListener.onClick(p0)
                        }

                        override fun onAnimationCancel(animation: Animator?) {}
                    })
        }
    }

}