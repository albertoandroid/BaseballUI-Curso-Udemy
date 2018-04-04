package com.androiddesdecero.baseballui

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_animation.*

class AnimationActivity : AppCompatActivity() {

    private var animationDuration: Long = 1000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        animationActivityBTXandY.setOnClickListener({
            var animatorX = ObjectAnimator.ofFloat(animationActivityIvImagen1, "x", 200f)
            var animatorY = ObjectAnimator.ofFloat(animationActivityIvImagen1, "y", 400f)
            animatorX.setDuration(animationDuration)
            animatorY.setDuration(animationDuration)
            var animatorSet = AnimatorSet()
            animatorSet.playTogether(animatorX, animatorY)
            animatorSet.start()
        })

        animationActivityBTAlpha.setOnClickListener({
            var animatorX = ObjectAnimator.ofFloat(animationActivityIvImagen2, "x" , 200f)
            animatorX.setDuration(animationDuration)
            var alphaAnimation = ObjectAnimator.ofFloat(animationActivityIvImagen2, View.ALPHA, 0.0f, 1.0f)
            alphaAnimation.setDuration(animationDuration)
            var animatorSet = AnimatorSet()
            animatorSet.playTogether(animatorX, alphaAnimation)
            animatorSet.start()
        })
    }
}
