package com.river.newfeeds.data.remote


class PostDataSource(private val postService: PostService) {
    suspend fun getPosts() =
        postService.getPostsAsync()

}