package com.albert.themedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class FullScreenPre44Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_screen_pre44)
        fullScreen()
    }

    private fun fullScreen() {
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
            or WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            or WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
        )
        actionBar?.hide()
    }

}
