package com.example.tkd_points

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //hiding title bar of this activity
        window.requestFeature(Window.FEATURE_NO_TITLE)
        //making this activity full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)

        //declaration animation
        val tkd = AnimationUtils.loadAnimation(this, R.anim.tkd_name)
        val logo = AnimationUtils.loadAnimation(this, R.anim.logo_tkd)
        val name = AnimationUtils.loadAnimation(this, R.anim.text_name)


        val tkdtitle = findViewById(R.id.textTkd) as TextView
        val tkdlogo = findViewById(R.id.imgLogo) as ImageView
        val textname = findViewById(R.id.textName) as TextView
        //set the animation
        tkdtitle.startAnimation(tkd)
        tkdlogo.startAnimation(logo)
        textname.startAnimation(name)


        //4second splash time
        Handler().postDelayed({
            //start main activity
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            //finish this activity
            finish()
        },4000)

    }
}