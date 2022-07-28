package com.zls.androidtemplate.data.repository

import com.zls.androidtemplate.data.remote.SampleApi
import com.zls.androidtemplate.data.remote.dto.PostResponse
import com.zls.androidtemplate.domain.repository.SampleRepository
import com.zls.androidtemplate.utils.Resource
import kotlinx.coroutines.flow.flow
import okhttp3.ResponseBody
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SampleRepositoryImpl @Inject constructor(
    private val api: SampleApi
): SampleRepository {
    override suspend fun getPosts(): Resource<Any> {
        return try {
            val result = api.getPosts()
            Resource.Success(result)
        } catch(e: IOException) {
            e.printStackTrace()
            Resource.Error(
                message = e.localizedMessage
            )
        } catch(e: HttpException) {
            e.printStackTrace()
            Resource.Error(
                message = e.localizedMessage
            )
        }
    }


}