package com.aibles.detail.domain.model

import com.google.gson.annotations.SerializedName

class ContentType1(
    @SerializedName("text")
    var text: String,

    @SerializedName("markups")
    var markups: ArrayList<Markup>
) {

}