package com.river.newfeeds.binding_adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aibles.repository.utils.Resource
import com.river.newfeeds.domain.model.Items
import com.river.newfeeds.view.ForYouAdapter


@BindingAdapter("app:setItems")
fun setItems(recyclerView: RecyclerView, resource: Resource<Items>?) {
     with(recyclerView.adapter as ForYouAdapter) {
          resource?.data?.let {
                    updateData(it.items)
          }
     }
}