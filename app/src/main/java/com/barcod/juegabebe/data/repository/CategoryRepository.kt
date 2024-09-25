package com.barcod.juegabebe.data.repository

import com.barcod.juegabebe.data.model.response.CategoryResponse
import com.barcod.juegabebe.data.network.service.CategoryService
import javax.inject.Inject

class CategoryRepository @Inject constructor(
    private val categoryService: CategoryService
) {

    suspend fun getCategoryRepository(): List<CategoryResponse>? {
        return categoryService.getCategory()
    }
}