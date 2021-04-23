package com.project.jebus.appdemobuttonanimation

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class CustomButtonAlpha(context: Context, attrs: AttributeSet?) : AppCompatButton(context, attrs), View.OnClickListener {

    init {
        setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        apply {
            alpha = 0.2f
            visibility = View.VISIBLE
            animate()
                    .alpha(1f).duration = 800
        }
    }

    interface OnClickListener {
        fun onClick(v: View?)
    }

}