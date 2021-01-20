package com.river.newfeeds.domain.model

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

class Content(
    @SerializedName("href")
    var href: String,

    @SerializedName("preview_image")
    var previewImage: PreviewImage,

    @SerializedName("duration")
    var duration: String
) {
//    var duration: String = "9999"
//    var duration: String = splitToComponentTimes(durationResponse)

//    private fun splitToComponentTimes(totalSecs: Int): String {
//        val hours = totalSecs / 3600;
//        val minutes = (totalSecs % 3600) / 60;
//        val seconds = totalSecs % 60;
//
//        val timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
//        return timeString
//    }

}