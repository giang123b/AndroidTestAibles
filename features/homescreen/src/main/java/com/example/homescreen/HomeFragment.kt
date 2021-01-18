package com.example.homescreen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.example.common.base.BaseFragment
import com.example.common.base.BaseViewModel
import com.example.homescreen.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment() {

    private val homeViewModel: HomeViewModel by viewModel()
    private lateinit var fragmentHomeBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)
        fragmentHomeBinding.homeViewModel = homeViewModel
        fragmentHomeBinding.lifecycleOwner = viewLifecycleOwner
        return fragmentHomeBinding.root
    }

    override fun getViewModel(): BaseViewModel = homeViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        configureRecyclerView()
    }

    private fun configureRecyclerView() {
        fragmentHomeBinding.recyclerViewUserHome.adapter = UserAdapter(homeViewModel)
    }
}