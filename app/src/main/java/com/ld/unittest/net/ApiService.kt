package com.ld.unittest.net

import com.ld.unittest.bean.HotKeyBean
import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 *Create on 2023/12/13 16:42
 *author cqx
 */
interface ApiService {

    @GET("/friend/json")
    suspend fun getHotKey(): HotKeyBean

    @GET("/mock")
    suspend fun mockData(): ResponseBody
}

fun createApiService(url: String? = null): ApiService {
    val builder = if (url.isNullOrEmpty()) Retrofit.Builder().baseUrl("https://www.wanandroid.com/")
    else Retrofit.Builder().baseUrl(url)

    val retrofit = builder.addConverterFactory(GsonConverterFactory.create()).build()
    return retrofit.create(ApiService::class.java)
}