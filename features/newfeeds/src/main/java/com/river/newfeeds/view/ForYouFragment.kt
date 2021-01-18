package com.river.newfeeds.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.R
import com.river.newfeeds.databinding.FragmentForYouBinding
import com.river.newfeeds.view_model.ForYouViewModel
import kotlinx.android.synthetic.main.fragment_for_you.*
import org.koin.android.viewmodel.ext.android.viewModel


class ForYouFragment : Fragment() {

    val forYouAdapter = ForYouAdapter()
//    lateinit var forYouViewModel: ForYouViewModel


    private val forYouViewModel: ForYouViewModel by viewModel()
    private lateinit var fragmentForYouBinding: FragmentForYouBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentForYouBinding = FragmentForYouBinding.inflate(inflater, container, false)
        fragmentForYouBinding.forYouViewModel = forYouViewModel
        fragmentForYouBinding.lifecycleOwner = viewLifecycleOwner
        return fragmentForYouBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val recyclerView_news_forYouScreen: RecyclerView =
//            view.findViewById(R.id.recyclerView_news_forYouScreen)

        recyclerView_news_forYouScreen.adapter = forYouAdapter

        recyclerView_news_forYouScreen.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
    }

}