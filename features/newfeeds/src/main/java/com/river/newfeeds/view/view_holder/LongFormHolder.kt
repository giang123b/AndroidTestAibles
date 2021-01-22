package com.river.newfeeds.view.view_holder

import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.databinding.ItemLongFormBinding
import com.river.newfeeds.domain.model.Post

class LongFormHolder (private val binding: ItemLongFormBinding): RecyclerView.ViewHolder(binding.root){
    fun bindData(post: Post){
        binding.post = post
    }
}