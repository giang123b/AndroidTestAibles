package com.river.newfeeds.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.databinding.*
import com.river.newfeeds.domain.model.Image
import com.river.newfeeds.domain.model.Post
import com.river.newfeeds.view.view_holder.*

class ImageAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var mListData = ArrayList<Image>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ImageHolder(ItemImageBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        return (holder as ImageHolder).bindData(
            mListData[position]
        )
    }


    override fun getItemCount() = mListData.size

    fun updateData(data: ArrayList<Image>) {
        mListData.clear()
        mListData.addAll(data)
    }
}