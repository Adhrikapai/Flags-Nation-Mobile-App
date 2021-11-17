package org.sheridan.adhrika991451940

/**
 * Name: Adhrika Pai
 * Student No: 991451940
 * Midterm Exam - Variant A
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    private lateinit var viewpager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        setupViewPager()
    }

    private fun initViews() {
        viewpager = findViewById(R.id.viewpager)
    }

    private fun setupViewPager() {

        val adapter = MyFragmentPagerAdapter(getSupportFragmentManager())

        var MyFragment: MyFragment = MyFragment.newInstance("First Fragment")
        var SecondFragment: SecondFragment = SecondFragment.newInstance("Second Fragment")
        var ThirdFragment: ThirdFragment = ThirdFragment.newInstance("Third Fragment")

        adapter.addFragment(MyFragment, "ONE")
        adapter.addFragment(SecondFragment, "TWO")
        adapter.addFragment(ThirdFragment, "THREE")
        viewpager!!.adapter = adapter

    }
}
