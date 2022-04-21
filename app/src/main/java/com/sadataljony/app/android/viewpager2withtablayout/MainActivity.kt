package com.sadataljony.app.android.viewpager2withtablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sadataljony.app.android.viewpager2withtablayout.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.sadataljony.app.android.viewpager2withtablayout.databinding.ActivityMainBinding

val fragmentArray = arrayOf(
    "First",
    "Second",
    "Third"
)

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = fragmentArray[position]
        }.attach()
    }
}