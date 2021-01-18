package com.example.homescreen

import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.aibles.model.User
import com.aibles.repository.utils.Resource
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object HomeBinding {

    @BindingAdapter("app:items")
    @JvmStatic fun setItems(recyclerView: RecyclerView, resource: Resource<List<User>>?) {
        with(recyclerView.adapter as UserAdapter) {
            resource?.data?.let { updateData(it) }
        }
    }

    @BindingAdapter("app:imageUrl")
    @JvmStatic fun loadImage(view: ImageView, url: String) {
        Glide.with(view.context).load(url).apply(RequestOptions.circleCropTransform()).into(view)
    }
}