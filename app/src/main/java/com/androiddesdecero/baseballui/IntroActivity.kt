package com.androiddesdecero.baseballui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {

    private lateinit var slideAdapter: SliderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        slideAdapter = SliderAdapter(this)
        introActivityViewPager.adapter = slideAdapter

        introActivityBtSaltar.setOnClickListener({
            startActivity(Intent(this@IntroActivity, InicioActivity::class.java))
        })
    }
}
