package com.aibles.detail.domain.model

import com.google.gson.annotations.SerializedName
import kotlin.collections.ArrayList

class DetailPost(
    @SerializedName("document_id")
    var documentId: String,

    @SerializedName("title")
    var title: String,

    @SerializedName("description")
    var description: String,

    @SerializedName("published_date")
    var publishedDate: String,

    @SerializedName("origin_url")
    var originUrl: String,

    @SerializedName("publisher")
    var publisher: Publisher,

    @SerializedName("template_type")
    var templateType: String,

    @SerializedName("sections")
    var sections: ArrayList<Section>?

) {


}