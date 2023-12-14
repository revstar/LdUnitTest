package com.ld.unittest.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ld.unittest.bean.HotKeyBean
import com.ld.unittest.net.createApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 *Create on 2023/12/13 16:59
 *author cqx
 */
class HotKeyViewModel : ViewModel() {

    val hotKeyLiveData = MutableLiveData<HotKeyBean>()

    fun getHotKey() {
        viewModelScope.launch {
            val apiService = createApiService()
            kotlin.runCatching {
                val response = withContext(Dispatchers.IO) {
                    apiService.getHotKey()
                }
                hotKeyLiveData.value = response
            }
        }
    }
}