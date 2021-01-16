package com.savis.newfeeds.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import com.savis.newfeeds.R
import kotlinx.android.synthetic.main.fragment_new_feeds.*

class NewFeedsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_new_feeds, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tabLayout_newFeedsScreen!!.addTab(tabLayout_newFeedsScreen!!.newTab().setText("Cho bạn"))
        tabLayout_newFeedsScreen!!.addTab(tabLayout_newFeedsScreen!!.newTab().setText("Theo dõi"))
        tabLayout_newFeedsScreen!!.addTab(tabLayout_newFeedsScreen!!.newTab().setText("Bóng đá"))
        tabLayout_newFeedsScreen!!.addTab(tabLayout_newFeedsScreen!!.newTab().setText("Công nghệ"))
        tabLayout_newFeedsScreen!!.addTab(tabLayout_newFeedsScreen!!.newTab().setText("Yêu thích"))
        tabLayout_newFeedsScreen!!.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = AdapterTabLayout(fragmentManager!!, tabLayout_newFeedsScreen!!.tabCount)
        viewPager_newFeedsScreen!!.adapter = adapter

        viewPager_newFeedsScreen!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout_newFeedsScreen))

        tabLayout_newFeedsScreen!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager_newFeedsScreen!!.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

    }

}