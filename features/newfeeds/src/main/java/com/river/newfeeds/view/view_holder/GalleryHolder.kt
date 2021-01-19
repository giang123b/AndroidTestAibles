package com.river.newfeeds.view.view_holder

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.river.newfeeds.databinding.ItemGalleryBinding
import com.river.newfeeds.domain.model.Post
import com.river.newfeeds.view.ImageAdapter
import kotlinx.android.synthetic.main.item_gallery.view.*


class GalleryHolder(private val binding: ItemGalleryBinding): RecyclerView.ViewHolder(binding.root){
    fun bindData(post: Post){
        binding.post = post

        val homeAdapter = ImageAdapter()
        itemView.recyclerView_images_itemGalleryScreen.adapter = homeAdapter

        itemView.recyclerView_images_itemGalleryScreen.layoutManager = GridLayoutManager(itemView.context, 3).apply {
            spanSizeLookup = object :GridLayoutManager.SpanSizeLookup(){
                override fun getSpanSize(position: Int): Int {
                    return 3
                }
            }
        }

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