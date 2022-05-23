package com.alexkong.groceries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeUi()
    }

    private fun initializeUi() {
        supportFragmentManager
                .beginTransaction()
                .add(R.id.main_container, SpecialsFragment.newInstance(), "specials")
                .commitAllowingStateLoss()
    }


}