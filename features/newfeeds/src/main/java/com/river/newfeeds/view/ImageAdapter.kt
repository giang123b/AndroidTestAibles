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

//    override fun getItemViewType(position: Int): Int {
//        if ((mListData[position].contentType) == "overview") return OVERVIEW
//        if ((mListData[position].contentType) == "story") return STORY
//        if ((mListData[position].contentType) == "gallery") return GALLERY
//        if ((mListData[position].contentType) == "video") return VIDEO
//        if ((mListData[position].contentType) == "article") return ARTICLE
//        return LONG_FORM
//    }

    override fun getItemCount() = mListData.size

    fun updateData(data: ArrayList<Image>) {
//        val diffCallback = ForYouDiffCallback(mListData, data)
//        val diffResult = DiffUtil.calculateDiff(diffCallback)
        mListData.clear()
        mListData.addAll(data)
//        diffResult.dispatchUpdatesTo(this)
    }
}