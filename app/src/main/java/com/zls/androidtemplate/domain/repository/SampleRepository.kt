package com.zls.androidtemplate.domain.repository

import com.zls.androidtemplate.data.remote.dto.PostResponse
import com.zls.androidtemplate.utils.Resource

interface SampleRepository {
    suspend fun getPosts(): Resource<Any>
}