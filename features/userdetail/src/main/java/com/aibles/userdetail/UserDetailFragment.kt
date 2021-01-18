package com.aibles.userdetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.aibles.userdetail.databinding.FragmentUserDetailBinding
import com.example.common.base.BaseFragment
import com.example.common.base.BaseViewModel
import org.koin.android.viewmodel.ext.android.viewModel


class UserDetailFragment : BaseFragment() {

    private val userDetailViewModel: UserDetailViewModel by viewModel()
    private lateinit var fragmentUserDetailBinding: FragmentUserDetailBinding

    private val UDargs: UserDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentUserDetailBinding = FragmentUserDetailBinding.inflate(inflater, container, false)
        fragmentUserDetailBinding.userDetailViewModel = userDetailViewModel
        fragmentUserDetailBinding.lifecycleOwner = viewLifecycleOwner
        return fragmentUserDetailBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        userDetailViewModel.loadDataWhenActivityStarts(UDargs.login)
    }

    override fun getViewModel(): BaseViewModel = userDetailViewModel

}