package com.river.newfeeds.view.view_holder

import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.databinding.ItemOverViewBinding
import com.river.newfeeds.domain.model.Post

class OverviewHolder (private val binding: ItemOverViewBinding): RecyclerView.ViewHolder(binding.root){
    fun bindData(post: Post){
        binding.post = post

//        Picasso.get().load("https://i.pinimg.com/236x/3f/c6/07/3fc607bd10827a23185a60253d0e4873.jpg")
//            .placeholder(R.drawable.avatar)
//            .into(
//                itemView.imageView_avatarPost_layoutPostScreen)

//        itemView.textView_authorPost_layoutPostScreen.text = post.name
//        itemView.textView_timePost_layoutPostScreen.text = post.time
//        itemView.textView_authorPost_layoutPostScreen.text = post.uid
//        itemView.textView_descriptionPost_layoutPostScreen.text = post.caption

//        Picasso.get().load(post.image).placeholder(R.drawable.avatar)
//            .into(
//                itemView.imageView_imagePost_layoutPostScreen)

//        itemView.textView_amountLike_layoutPostScreen.text = post.like.toString()
//        itemView.textView_amountComment_layoutPostScreen.text = post.comment.toString()
//        itemView.textView_amountShare_layoutPostScreen.text = post.share.toString()
    }
}