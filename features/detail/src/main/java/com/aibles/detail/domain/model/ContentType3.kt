package com.aibles.detail.domain.model

import com.google.gson.annotations.SerializedName

class ContentType3(
    @SerializedName("href")
    var href: String,

    @SerializedName("caption")
    var caption: String,

    @SerializedName("main_color")
    var mainColor: String,

    @SerializedName("original_width")
    var originalWidth: String,

    @SerializedName("original_height")
    var originalHeight: String
) {

}