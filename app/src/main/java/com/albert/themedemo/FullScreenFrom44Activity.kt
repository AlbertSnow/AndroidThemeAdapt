package com.albert.themedemo

import android.annotation.TargetApi
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.KITKAT)
class FullScreenFrom44Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_screen_pre44)
        initView()
    }

    private fun initView() {
        findViewById<View>(R.id.show_system_ui_btn).setOnClickListener { showSystemUi() }
        findViewById<View>(R.id.hide_system_ui_btn).setOnClickListener { hideSystemUi() }

    }

    //or 16 API ,immersive 19 API
    private fun hideSystemUi(): Unit {
        val visibleFlag: Int =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or (
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION ) or (
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN ) or (
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION ) or (
                View.SYSTEM_UI_FLAG_FULLSCREEN ) or (
                View.SYSTEM_UI_FLAG_IMMERSIVE )
        window.decorView.systemUiVisibility = visibleFlag
    }

    private fun showSystemUi(): Unit {
        val visibleFlag: Int =
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE or (
                    View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION ) or (
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN )
        window.decorView.systemUiVisibility = visibleFlag
    }

}
