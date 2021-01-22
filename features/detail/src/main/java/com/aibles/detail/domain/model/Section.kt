package com.aibles.detail.domain.model

import com.google.gson.annotations.SerializedName

class Section(
    @SerializedName("section_type")
    var sectionType: String,

    @SerializedName("content")
    var content: Any
) {
}