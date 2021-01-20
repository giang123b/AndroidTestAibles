package com.river.newfeeds.view.view_holder

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.databinding.ItemStoryBinding
import com.river.newfeeds.domain.model.Post
import com.river.newfeeds.view.ImageAdapter
import kotlinx.android.synthetic.main.item_story.view.*

class StoryHolder (private val binding: ItemStoryBinding): RecyclerView.ViewHolder(binding.root){
    fun bindData(post: Post){
        binding.post = post
        val homeAdapter = ImageAdapter()
        itemView.recyclerView_images_itemStoryScreen.adapter = homeAdapter

        itemView.recyclerView_images_itemStoryScreen.layoutManager =
            LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
    }
}