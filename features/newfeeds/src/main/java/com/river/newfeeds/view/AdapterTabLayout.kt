package com.river.newfeeds.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.river.newfeeds.view.other_screen.FavoriteFragment
import com.river.newfeeds.view.other_screen.FollowFragment
import com.river.newfeeds.view.other_screen.FootballFragment
import com.river.newfeeds.view.other_screen.TechnologyFragment

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