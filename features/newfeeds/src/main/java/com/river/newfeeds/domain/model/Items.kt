package com.river.newfeeds.domain.model

import com.google.gson.annotations.SerializedName

class Items(
    @SerializedName("items")
    var items: ArrayList<Post>
) {
}