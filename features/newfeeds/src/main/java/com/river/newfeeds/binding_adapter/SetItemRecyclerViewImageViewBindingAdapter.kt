package com.river.newfeeds.binding_adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.domain.model.Image
import com.river.newfeeds.view.ImageAdapter


@BindingAdapter("app:setListImage")
fun setListImage(recyclerView: RecyclerView, resource: ArrayList<Image>?) {
    if(recyclerView.adapter != null ){
        with(recyclerView.adapter as ImageAdapter) {
            resource?.let {
                updateData(it)
            }
        }
    }
}