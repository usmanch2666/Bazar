package com.example.bazaarbooks

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.example.bazaarbooks.databinding.ActivitySplashBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class Splash : AppCompatActivity() {

    val binding: ActivitySplashBinding?=null
    private val bindingLazy by lazy { ActivitySplashBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        bindingLazy = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(bindingLazy.root)
       moveToHome()

    }

    private fun moveToHome() {
//        Handler(Looper.getMainLooper()).postDelayed({
//            startActivity(Intent(this@Splash, MainActivity::class.java))
//        },3000)

        lifecycleScope.launch {
            delay(3000)
            startActivity(Intent(this@Splash, MainActivity::class.java))
        }
    }
}