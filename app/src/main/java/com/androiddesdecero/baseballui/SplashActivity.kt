package com.androiddesdecero.baseballui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var animation = AnimationUtils.loadAnimation(this, R.anim.animation)
        splashActivityIvLogo.startAnimation(animation)
        splashActivityTv.startAnimation(animation)

        var handler = Handler().postDelayed({
            startActivity(Intent(this, IntroActivity::class.java))
        }, 3000)
    }
}
