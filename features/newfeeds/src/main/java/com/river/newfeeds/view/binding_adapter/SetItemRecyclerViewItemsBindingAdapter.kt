package com.river.newfeeds.view.binding_adapter

import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.aibles.model.User
import com.aibles.repository.utils.Resource
import com.river.newfeeds.domain.model.Items
import com.river.newfeeds.domain.model.Post
import com.river.newfeeds.view.ForYouAdapter
import retrofit2.Response


@BindingAdapter("app:setItems")
fun setItems(recyclerView: RecyclerView, resource: Resource<Items>?) {
     with(recyclerView.adapter as ForYouAdapter) {
          resource?.data?.let {
                    updateData(it.items)
          }
     }
}

//@BindingAdapter("app:items")
//@JvmStatic fun setItems(recyclerView: RecyclerView, resource: Resource<List<User>>?) {
//     with(recyclerView.adapter as UserAdapter) {
//          resource?.data?.let { updateData(it) }
//     }
//}