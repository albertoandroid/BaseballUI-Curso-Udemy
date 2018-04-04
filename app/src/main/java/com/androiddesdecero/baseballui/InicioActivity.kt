package com.androiddesdecero.baseballui

import android.app.Dialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_inicio.*
import kotlinx.android.synthetic.main.alert_dialog.*

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
                R.id.amigos -> {
                    startActivity(Intent(this@InicioActivity, AmigosActivity::class.java))
                    true
                }
                R.id.alerta-> {
                    var dialog = Dialog(this@InicioActivity)
                    dialog.setContentView(R.layout.alert_dialog)
                    dialog.show()
                    dialog.alertDialogVerPerfil.setOnClickListener({
                        startActivity(Intent(this@InicioActivity, ProfileActivity::class.java))
                        finish()
                    })
                    dialog.alertDialogCerrar.setOnClickListener({
                        dialog.dismiss()
                    })
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
