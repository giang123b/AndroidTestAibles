package com.river.newfeeds.view.view_holder

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.databinding.ItemArticleBinding
import com.river.newfeeds.domain.model.Post
import com.river.newfeeds.view.ImageAdapter
import kotlinx.android.synthetic.main.item_gallery.view.*

class ArticleHolder (private val binding: ItemArticleBinding): RecyclerView.ViewHolder(binding.root){
    fun bindData(post: Post){
        binding.post = post
    }
}