/*
 * Copyright (c) 2019.
 * Written By Djaka Pradana Jaya Priambudi
 */

package id.djaka.meetviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import android.view.animation.AnimationUtils

class MainActivity : AppCompatActivity() {
    val data: ArrayList<PageModel> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        prepareData()
        prepareViewPager()
    }

    private fun addData(message:String, color:Int){
        data.add(PageModel(message, color))
    }

    private fun prepareData() {
        addData("I'm Angry >:(", android.R.color.holo_red_dark)
        addData("I'm sad :'(", android.R.color.holo_blue_dark)
        addData("I'm happy :D", android.R.color.holo_green_dark)
    }

    private fun prepareViewPager() {
        vp_main.adapter = VPMainAdapter(data)
        vp_main.orientation = ViewPager2.ORIENTATION_VERTICAL

//        Uncomment below line to enable animation
//        addAnimation()
    }

    private fun addAnimation(){
        val animation = AnimationUtils.loadLayoutAnimation(this, R.anim.layout_animation_fall_down)
        vp_main.layoutAnimation = animation
    }
}
