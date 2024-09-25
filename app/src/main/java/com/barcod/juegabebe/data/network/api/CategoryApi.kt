package com.barcod.juegabebe.data.network.api

import com.barcod.juegabebe.data.model.response.CategoryResponse
import retrofit2.Response
import retrofit2.http.GET

interface CategoryApi {
    @GET("api/juegocategoria")
    suspend fun getCategory(): Response<List<CategoryResponse>>
}