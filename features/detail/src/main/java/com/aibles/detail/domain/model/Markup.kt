package com.aibles.detail.domain.model

import com.google.gson.annotations.SerializedName

class Markup(
    @SerializedName("markup_type")
    var markupType: String,

    @SerializedName("start")
    var start: String,

    @SerializedName("end")
    var end: String
) {

}