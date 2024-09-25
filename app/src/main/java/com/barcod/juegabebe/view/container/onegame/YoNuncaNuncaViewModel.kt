package com.barcod.juegabebe.view.container.onegame

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.barcod.juegabebe.network.Connection
import com.barcod.juegabebe.network.Endpoints
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Response

class YoNuncaNuncaViewModel : ViewModel()  {

    private val _onLoginLiveData = MutableLiveData<String>()
    val onLoginLiveData: LiveData<String> = _onLoginLiveData

//    @OptIn(DelicateCoroutinesApi::class)
//    fun getCitas(context: Context) {
//        GlobalScope.launch(Dispatchers.IO) {
//            try {
//                val service: Endpoints = Connection.ResponseEngine().create(Endpoints::class.java)
//                val response: Response<LoginResponse> = service.postLogin(loginRequest)
//                if (response.isSuccessful) {
//                    val data = response.body()
//                    data?.let {
//                        val sharedPreferences = context.getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)
//                        val editor = sharedPreferences.edit()
//                        editor.putString("TOKEN", data.token)
//                        editor.putLong("EXPIRATION_TIME", System.currentTimeMillis() + (data.expires_in * 1000))
//                        editor.apply()
//                        _onLoginLiveData.postValue(response.isSuccessful.toString())
//                    }
//                } else {
//                    Log.d("Error:", "${response.errorBody()}")
//                }
//            } catch (e: Exception) {
//                e.printStackTrace()
//            }
//        }
//    }

}
