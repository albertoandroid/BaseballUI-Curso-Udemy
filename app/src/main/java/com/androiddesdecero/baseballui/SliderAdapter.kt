package com.androiddesdecero.baseballui

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.slide_layout.view.*
import java.io.File
import javax.xml.transform.Templates

/**
 * Created by albertopalomarrobledo on 28/3/18.
 */
class SliderAdapter (var context: Context): PagerAdapter() {

    private val layoutInfalter: LayoutInflater

    init {
        layoutInfalter = LayoutInflater.from(context)
    }

    var slide_background: IntArray = intArrayOf(R.drawable.gradientintro1, R.drawable.gradient, R.drawable.gradientintro2)
    var slide_images: IntArray = intArrayOf(R.drawable.ic_baseball_intro1, R.drawable.ic_baseball_intro2, R.drawable.ic_baseball_intro3)
    var slide_headings = arrayOf(R.string.intro_bienvenido, R.string.intro_disfruta, R.string.intro_redsocial)
    var slide_descriptions = arrayOf(R.string.intro_bienvenido_des, R.string.intro_disfruta_des, R.string.intro_redsocial_des)


    override fun isViewFromObject(view: View, `object`: Any?): Boolean {
         return view === `object` as (RelativeLayout)
    }

    override fun getCount(): Int {
        return slide_headings.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = layoutInfalter.inflate(R.layout.slide_layout, container, false)
        view.slideLayoutRelativeLayout.setBackgroundResource(slide_background[position])
        view.slideLayoutImageView.setImageResource(slide_images[position])
        view.slideLayoutTv1.setText(slide_headings[position])
        view.slideLayoutTv2.setText(slide_descriptions[position])
        if(position == 0){
            view.slideLayoutTvPoint1.setTextColor(context.resources.getColor(R.color.colorWhite))
            view.slideLayoutTvPoint2.setTextColor(context.resources.getColor(R.color.colorTransparentWhite))
            view.slideLayoutTvPoint3.setTextColor(context.resources.getColor(R.color.colorTransparentWhite))
        }
        if(position == 1){
            view.slideLayoutTvPoint1.setTextColor(context.resources.getColor(R.color.colorTransparentWhite))
            view.slideLayoutTvPoint2.setTextColor(context.resources.getColor(R.color.colorWhite))
            view.slideLayoutTvPoint3.setTextColor(context.resources.getColor(R.color.colorTransparentWhite))
        }
        if(position == 2){
            view.slideLayoutTvPoint1.setTextColor(context.resources.getColor(R.color.colorTransparentWhite))
            view.slideLayoutTvPoint2.setTextColor(context.resources.getColor(R.color.colorTransparentWhite))
            view.slideLayoutTvPoint3.setTextColor(context.resources.getColor(R.color.colorWhite))
        }
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any?) {
        container.removeView(`object` as (RelativeLayout))
    }
}