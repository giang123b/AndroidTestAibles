package com.river.newfeeds.domain.model

import com.google.gson.annotations.SerializedName

class Image(
    @SerializedName("href")
    var href: String,

    @SerializedName("main_color")
    var mainColor: Image,

    @SerializedName("width")
    var width: Int,

    @SerializedName("height")
    var height: Int
) {
}