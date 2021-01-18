package com.river.newfeeds.view

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aibles.repository.utils.Resource
import com.river.newfeeds.domain.model.Post


@BindingAdapter("app:setItems")
fun setItems(recyclerView: RecyclerView, resource: Resource<ArrayList<Post>>?) {
     with(recyclerView.adapter as ForYouAdapter) {
          resource?.data?.let { updateData(it) }
     }
}