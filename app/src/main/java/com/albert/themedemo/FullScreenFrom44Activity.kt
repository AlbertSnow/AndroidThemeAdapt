package com.albert.themedemo

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.annotation.RequiresApi

/**
 * FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS
 */
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class FullScreenFrom44Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_screen_pre44)
        initView()
    }

    private fun initView() {
        val controlView = findViewById<View>(R.id.control_view)
        window.decorView.setOnSystemUiVisibilityChangeListener { flags:Int ->
            var isVisible = (flags and View.SYSTEM_UI_FLAG_HIDE_NAVIGATION) == 0
            controlView.visibility = if (isVisible) View.VISIBLE else View.GONE
        }


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

        // Translucent status bar
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = Color.TRANSPARENT

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
