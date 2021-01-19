package com.river.newfeeds.view.view_holder

import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.R
import com.river.newfeeds.databinding.ItemImageBinding
import com.river.newfeeds.databinding.ItemVideoBinding
import com.river.newfeeds.domain.model.Image
import com.river.newfeeds.domain.model.Post
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_image.view.*

class ImageHolder (private val binding: ItemImageBinding): RecyclerView.ViewHolder(binding.root){
    fun bindData(post: Image){
        binding.post = post


        Picasso.get().load("https://i.pinimg.com/236x/3f/c6/07/3fc607bd10827a23185a60253d0e4873.jpg")
            .placeholder(R.drawable.ic_baseline_image_24)
            .into(
                itemView.imageView_image_itemImageScreen)

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