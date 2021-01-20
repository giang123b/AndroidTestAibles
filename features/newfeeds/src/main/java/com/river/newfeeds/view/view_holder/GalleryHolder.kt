package com.river.newfeeds.view.view_holder

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.databinding.ItemGalleryBinding
import com.river.newfeeds.domain.model.Post
import com.river.newfeeds.view.ImageAdapter
import kotlinx.android.synthetic.main.item_gallery.view.*


class GalleryHolder(private val binding: ItemGalleryBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bindData(post: Post) {
        binding.post = post

        val homeAdapter = ImageAdapter()
        itemView.recyclerView_images_itemGalleryScreen.adapter = homeAdapter

        itemView.recyclerView_images_itemGalleryScreen.layoutManager =
            GridLayoutManager(itemView.context, 3)
    }
}