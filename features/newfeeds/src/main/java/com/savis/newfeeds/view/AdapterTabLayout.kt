package com.savis.newfeeds.view

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class AdapterTabLayout(fm: FragmentManager, private var totalTabs: Int)
    : FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return ForYouFragment()
            }
            1 -> {
                return FollowFragment()
            }
            2 -> {
                return FootballFragment()
            }
            3 -> {
                return TechnologyFragment()
            }
            4 -> {
                return FavoriteFragment()
            }

            else -> return ForYouFragment()
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}