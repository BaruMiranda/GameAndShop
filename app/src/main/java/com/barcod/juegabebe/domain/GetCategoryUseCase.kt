package com.barcod.juegabebe.domain

import com.barcod.juegabebe.data.model.response.CategoryResponse
import com.barcod.juegabebe.data.repository.CategoryRepository
import javax.inject.Inject

class GetCategoryUseCase @Inject constructor(
    private val getCategoryRepository: CategoryRepository
) {

    suspend operator fun invoke(): List<CategoryResponse>? {
        return getCategoryRepository.getCategoryRepository()
    }

}