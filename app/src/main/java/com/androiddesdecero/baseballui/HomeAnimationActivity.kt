package com.androiddesdecero.baseballui

import android.app.ActivityOptions
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Pair

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

        homeAnimationActivityTvTransition.setOnClickListener({
            var pair: Pair<View, String> = Pair<View,String>(homeAnimationActivityIv, "ivTransition")
            var pair2: Pair<View, String> = Pair<View,String>(homeAnimationActivityTvTransition, "tvTransition")

            var intent = Intent(this@HomeAnimationActivity, TransitionActivity::class.java)
            var optiones = ActivityOptions.makeSceneTransitionAnimation(this, pair, pair2)

            startActivity(intent, optiones.toBundle())


        })

    }
}
