package com.river.newfeeds.domain.model

import com.google.gson.annotations.SerializedName

class Image(
    @SerializedName("href")
    var href: String,

    @SerializedName("main_color")
    var mainColor: String,

    @SerializedName("width")
    var width: Int,

    @SerializedName("height")
    var height: Int
) {
    override fun toString(): String {
        return "image detail:$href\n mainColor:$mainColor"
    }
}