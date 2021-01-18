package com.river.newfeeds.view

import androidx.annotation.Nullable
import androidx.recyclerview.widget.DiffUtil
import com.river.newfeeds.domain.model.Post

class ForYouDiffCallback(private val oldList: List<Post>, private val newList: List<Post>) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {

        return  oldList[oldItemPosition].documentId == newList[newItemPosition].documentId
    }

    override fun areContentsTheSame(oldPosition: Int, newPosition: Int): Boolean {
        return newList[newPosition] == oldList[oldPosition]
    }

    @Nullable
    override fun getChangePayload(oldPosition: Int, newPosition: Int): Any? {
        return super.getChangePayload(oldPosition, newPosition)
    }
}