package com.river.newfeeds.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.databinding.*
import com.river.newfeeds.domain.model.Post
import com.river.newfeeds.view.view_holder.*

class ForYouAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val OVERVIEW = 1
    private val STORY = 2
    private val GALLERY = 3
    private val VIDEO = 4
    private val ARTICLE = 5
    private val LONG_FORM = 6
    private var mListData = ArrayList<Post>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            OVERVIEW -> OverviewHolder(
                ItemOverViewBinding.inflate(LayoutInflater.from(parent.context))
            )
            STORY -> StoryHolder(
                ItemStoryBinding.inflate(LayoutInflater.from(parent.context))
            )
            GALLERY -> GalleryHolder(
                ItemGalleryBinding.inflate(LayoutInflater.from(parent.context))
            )
            VIDEO -> VideoHolder(
                ItemVideoBinding.inflate(LayoutInflater.from(parent.context))
            )
            ARTICLE -> ArticleHolder(
                ItemArticleBinding.inflate(LayoutInflater.from(parent.context))
            )
            else -> LongFormHolder(
                ItemLongFormBinding.inflate(LayoutInflater.from(parent.context))
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if ((mListData[position].contentType) == "overview") return (holder as OverviewHolder).bindData(
            mListData[position]
        )
        if ((mListData[position].contentType) == "story") return (holder as StoryHolder).bindData(
            mListData[position]
        )
        if ((mListData[position].contentType) == "gallery") return (holder as GalleryHolder).bindData(
            mListData[position]
        )
        if ((mListData[position].contentType) == "video") return (holder as VideoHolder).bindData(
            mListData[position]
        )
        if ((mListData[position].contentType) == "article") return (holder as ArticleHolder).bindData(
            mListData[position]
        )
        return (holder as LongFormHolder).bindData(mListData[position])

    }

    override fun getItemViewType(position: Int): Int {
        if ((mListData[position].contentType) == "overview") return OVERVIEW
        if ((mListData[position].contentType) == "story") return STORY
        if ((mListData[position].contentType) == "gallery") return GALLERY
        if ((mListData[position].contentType) == "video") return VIDEO
        if ((mListData[position].contentType) == "article") return ARTICLE
        return LONG_FORM
    }

    override fun getItemCount() = mListData.size

    fun updateData(data: ArrayList<Post>) {
        val diffCallback = ForYouDiffCallback(mListData, data)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        mListData.clear()
        mListData.addAll(data)
        diffResult.dispatchUpdatesTo(this)
    }
}