package br.cassio.devmedia.animationlottie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pauseButton = findViewById<View>(R.id.button_pause)
        val stopButton = findViewById<View>(R.id.button_stop)
        val animationView = findViewById<View>(R.id.animation_view) as LottieAnimationView

        pauseButton.setOnClickListener{
            if (animation_view.isAnimating()) {
                animation_view.pauseAnimation()
                button_pause.setImageResource(R.drawable.playbutton)
            }else {
                animation_view.resumeAnimation()
                button_pause.setImageResource(R.drawable.pausebutton)
            }
        }
        stopButton.setOnClickListener{
            animationView.cancelAnimation()
            animationView.setProgress(0F)
            button_pause.setImageResource(R.drawable.playbutton)
        }
    }




    }

