package com.river.newfeeds.view.binding_adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aibles.repository.utils.Resource
import com.bumptech.glide.Glide


@BindingAdapter("android:loadImage")
fun loadImage(view: ImageView, imageUrl: String?) {
     Glide.with(view.context)
          .load(imageUrl)
          .into(view)
}
