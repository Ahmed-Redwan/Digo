package android.training2022.digo.ui.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.training2022.digo.R
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val iv_logo = findViewById<ImageView>(R.id.splash_iv_logo)

        val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.anim)
        iv_logo.startAnimation(animationFadeIn)

        Handler(Looper.getMainLooper()).postDelayed(
            {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            },
            5500 // value in milliseconds
        )


    }
}