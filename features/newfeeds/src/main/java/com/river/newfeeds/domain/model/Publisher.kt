package com.river.newfeeds.domain.model

import com.google.gson.annotations.SerializedName

class Publisher(
    @SerializedName("id")
    var id: String,

    @SerializedName("name")
    var name: String,

    @SerializedName("icon")
    var icon: String
) {
}