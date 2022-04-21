package com.sadataljony.app.android.viewpager2withtablayout.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sadataljony.app.android.viewpager2withtablayout.fragment.FirstFragment
import com.sadataljony.app.android.viewpager2withtablayout.fragment.SecondFragment
import com.sadataljony.app.android.viewpager2withtablayout.fragment.ThirdFragment

private const val NUM_TABS = 3

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return FirstFragment()
            1 -> return SecondFragment()
        }
        return ThirdFragment()
    }
}