package com.androiddesdecero.baseballui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_inicio.*

class InicioActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        toggle = ActionBarDrawerToggle(this, inicioActivityDrawerLayout, R.string.open, R.string.close)
        inicioActivityDrawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        inicioActivityNavigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.profile -> {
                    //startActivity(Intent(this@InicioActivity, SplashActivity::class.java))
                    true
                }
                else -> false
            }

        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
