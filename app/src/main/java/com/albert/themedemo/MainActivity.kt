package com.albert.themedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SimpleAdapter
import kotlin.reflect.KClass
import java.lang.Class as Class

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        val listView : ListView = findViewById(R.id.main_jump_list_view)

        listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
            arrayOf(
                "FullScreen Before 4.4 - WindowManager",
                "FullScreen Before 4.4 - UI flag",
                "FullScreen From 4.4 - Immersive",
                "For huawei p20, status bar"
            )
        )

        listView.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            val intent = Intent()
            when (position) {
                0 -> {
                    intent.setClass(baseContext, FullScreenPre44Activity::class.java)
                }
                1 -> {
                    intent.setClass(baseContext, FullScreenPre44UIFlagActivity::class.java)
                }
                2 -> {
                    intent.setClass(baseContext, FullScreenFrom44Activity::class.java)
                }
                3 -> {
                    intent.setClass(baseContext, ForHuaWeiActivity::class.java)
                }
            }

            startActivity(intent)
        }


    }
}
