package com.aibles.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.*
import java.util.concurrent.TimeUnit

@Entity
data class User (
    @SerializedName("login")
    val login: String,

    @PrimaryKey
    @SerializedName("id")
    val id: String,

    @SerializedName("avatar_url")
    val avatarUrl: String,

    @SerializedName("name")
    val name: String?,

    @SerializedName("company")
    val company: String?,

    @SerializedName("blog")
    val blog: String?,

    @SerializedName("location")
    val location: String?,

    @SerializedName("email")
    val email: String?,

    @SerializedName("bio")
    val bio: String?,

    @SerializedName("followers")
    val followers: Int?,

    @SerializedName("updated_at")
    val updatedAt: String?,

    var lastRefreshed: Date
) {

    fun haveToRefreshFromNetwork() : Boolean
            = TimeUnit.MILLISECONDS.toMinutes(Date().time - lastRefreshed.time) >= 10
}