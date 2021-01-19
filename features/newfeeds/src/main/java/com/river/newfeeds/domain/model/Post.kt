package com.river.newfeeds.domain.model

import com.google.gson.annotations.SerializedName
import java.util.*
import kotlin.collections.ArrayList

class Post(
    @SerializedName("document_id")
    var documentId: String,

    @SerializedName("title")
    var title: String,

    @SerializedName("description")
    var description: String,

    @SerializedName("content_type")
    var contentType: String,

    @SerializedName("published_date")
    var publishedDate: String,

    @SerializedName("publisher")
    var publisher: Publisher,

    @SerializedName("origin_url")
    var originUrl: String,

    @SerializedName("avatar")
    var avatar: Avatar,

    @SerializedName("images")
    var images: ArrayList<Image>?,

    @SerializedName("content")
    var content: Objects
) {


}