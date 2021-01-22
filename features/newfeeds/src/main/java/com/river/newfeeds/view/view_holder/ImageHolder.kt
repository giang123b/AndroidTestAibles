package com.river.newfeeds.view.view_holder

import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.R
import com.river.newfeeds.databinding.ItemImageBinding
import com.river.newfeeds.databinding.ItemVideoBinding
import com.river.newfeeds.domain.model.Image
import com.river.newfeeds.domain.model.Post
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_image.view.*

class ImageHolder (private val binding: ItemImageBinding): RecyclerView.ViewHolder(binding.root){
    fun bindData(post: Image){
        binding.post = post
    }
}