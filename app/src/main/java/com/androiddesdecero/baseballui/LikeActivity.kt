package com.androiddesdecero.baseballui

import android.animation.Animator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.activity_like.*
import java.io.File

class LikeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_like)

        animation_view_like.visibility = View.GONE
        imageView2.setOnClickListener({
            animation(animation_view_like)
            animation_view_like.visibility = View.VISIBLE
            animation_view_like.playAnimation()
        })
    }

    private fun animation(animation: LottieAnimationView){
        animation.addAnimatorListener(object: Animator.AnimatorListener{

            override fun onAnimationRepeat(p0: Animator?) {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onAnimationEnd(p0: Animator?) {
                animation_view_like.visibility = View.GONE
            }

            override fun onAnimationCancel(p0: Animator?) {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onAnimationStart(p0: Animator?) {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }
}
