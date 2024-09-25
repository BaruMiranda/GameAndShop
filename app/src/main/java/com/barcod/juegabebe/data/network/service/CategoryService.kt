package com.barcod.juegabebe.data.network.service

import com.barcod.juegabebe.data.model.response.CategoryResponse
import com.barcod.juegabebe.data.network.api.CategoryApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CategoryService @Inject constructor(
    private val categoryApi: CategoryApi
) {
    suspend fun getCategory(): List<CategoryResponse>? {
        return withContext(Dispatchers.IO) {
            val response = categoryApi.getCategory()
            response.body()
        }
    }
}