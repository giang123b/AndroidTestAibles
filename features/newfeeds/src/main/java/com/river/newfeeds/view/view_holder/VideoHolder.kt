package com.river.newfeeds.view.view_holder

import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.databinding.ItemVideoBinding
import com.river.newfeeds.domain.model.Post

class VideoHolder (private val binding: ItemVideoBinding): RecyclerView.ViewHolder(binding.root){
    fun bindData(post: Post){
        binding.post = post
    }
}