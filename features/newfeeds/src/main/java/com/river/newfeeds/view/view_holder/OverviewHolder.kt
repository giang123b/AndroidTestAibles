package com.river.newfeeds.view.view_holder

import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.databinding.ItemOverViewBinding
import com.river.newfeeds.domain.model.Post

class OverviewHolder (private val binding: ItemOverViewBinding): RecyclerView.ViewHolder(binding.root){
    fun bindData(post: Post){
        binding.post = post

        itemView.setOnClickListener {
            Log.e("colick", "colick")
        }
    }
}