package com.barcod.juegabebe.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.barcod.juegabebe.data.model.response.CategoryResponse
import com.barcod.juegabebe.domain.GetCategoryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val getCategoryUseCase: GetCategoryUseCase
) : ViewModel() {

    private val _itemCategoryLiveData = MutableLiveData<List<CategoryResponse>?>()
    val itemCategoryLiveData: LiveData<List<CategoryResponse>?> = _itemCategoryLiveData

    private val _isReady = MutableLiveData<Boolean>()
    val isReady: LiveData<Boolean> = _isReady

    fun getCategory() {
        viewModelScope.launch {
            val result = getCategoryUseCase()
            result?.let {
                _isReady.value = true
                _itemCategoryLiveData.value = result
            } ?: run {
                Log.d("Error", "Error Response")
            }
        }
    }
}