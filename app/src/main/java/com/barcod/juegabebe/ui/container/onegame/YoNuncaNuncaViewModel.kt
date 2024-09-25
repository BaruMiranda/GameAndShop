package com.barcod.juegabebe.ui.container.onegame

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

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
