package com.arun.prajasahayak;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

private val SPLASH_TIME_OUT:Long=3000

        override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        window.setFlags(
        WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)


        Handler().postDelayed({
        startActivity(Intent(this,SymptomsActivity::class.java))
        finish()
        }, SPLASH_TIME_OUT)

        var imageView = splash_img
        imageView = findViewById(R.id.splash_img)
        val myanim = AnimationUtils.loadAnimation(this, R.anim.fade_out)
        imageView.startAnimation(myanim)
        }
        }