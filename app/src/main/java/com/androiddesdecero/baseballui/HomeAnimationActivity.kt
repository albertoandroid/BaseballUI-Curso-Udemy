package com.androiddesdecero.baseballui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home_animation.*

class HomeAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_animation)

        homeAnimationActivityTvAnimation.setOnClickListener({
            startActivity(Intent(this@HomeAnimationActivity, AnimationActivity::class.java))

        })

        homeAnimationActivityTvFadeInOut.setOnClickListener({
            startActivity(Intent(this@HomeAnimationActivity, FadeActivity::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        })
    }
}
