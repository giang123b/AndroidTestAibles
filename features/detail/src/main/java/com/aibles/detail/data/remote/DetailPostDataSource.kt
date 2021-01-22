package com.aibles.detail.data.remote


class DetailPostDataSource(private val postService: DetailPostService) {
    suspend fun getDetailPosts() =
        postService.getPostsAsync()

}