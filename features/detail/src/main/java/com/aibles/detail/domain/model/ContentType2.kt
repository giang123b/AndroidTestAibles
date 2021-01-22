package com.aibles.detail.domain.model

import com.google.gson.annotations.SerializedName

class ContentType2(
    @SerializedName("href")
    var href: String,

    @SerializedName("caption")
    var caption: String,

    @SerializedName("duration")
    var duration: String,

    @SerializedName("preview_image")
    var previewImage: PreviewImage
) {

}