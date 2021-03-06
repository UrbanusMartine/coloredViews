package com.example.coluredviews

import android.R.*
import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()


    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(box_one, box_two, box_three, box_four, box_five, constraint_layout)
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
        }


      
         private fun makeColored(view: View) = when (view.id) {
             //boxes using color class colors for background
             R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
             R.id.box_two -> view.setBackgroundColor(Color.GRAY)

             //boxes using android resource colors for background
             R.id.box_three -> view.setBackgroundResource(android.R.color.holo_green_light)

             R.id.box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)

             R.id.box_five -> view.setBackgroundResource(android.R.color.holo_orange_light)

             else -> view.setBackgroundColor(Color.LTGRAY)

    }




