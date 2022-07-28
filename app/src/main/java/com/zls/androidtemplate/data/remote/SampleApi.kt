package com.zls.androidtemplate.data.remote

import com.zls.androidtemplate.data.remote.dto.PostResponse
import okhttp3.ResponseBody
import retrofit2.http.GET

interface SampleApi {

    @GET("posts")
    suspend fun getPosts(): Any


    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }
}