package com.faizalfakh.moviecatalogue.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.faizalfakh.moviecatalogue.R
import com.faizalfakh.moviecatalogue.ui.main.adapter.SectionsPagerAdapter
import com.faizalfakh.moviecatalogue.utils.Helper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var helper: Helper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helper = Helper(this)

        if(helper.isInternetAvailable(this)){
            val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
            view_pager.adapter = sectionsPagerAdapter
            tabs.setupWithViewPager(view_pager)

            supportActionBar?.elevation = 0f
        }else{
            warning.visibility = View.VISIBLE
        }
    }
}