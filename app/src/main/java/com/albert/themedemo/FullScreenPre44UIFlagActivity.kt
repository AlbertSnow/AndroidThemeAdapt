package com.albert.themedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FullScreenPre44UIFlagActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_screen_pre44)
        fullScreen()
    }

    override fun onResume() {
        super.onResume()
        fullScreen()
    }

    // it will show navigation bar when touch the window
    // And window
    private fun fullScreen() {
        var uiOptions =
            View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        uiOptions = uiOptions or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        window.decorView.systemUiVisibility = uiOptions
    }

}
