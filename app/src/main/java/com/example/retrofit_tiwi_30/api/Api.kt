package com.example.retrofit_tiwi_30.api

import com.example.retrofit_tiwi_30.model.IndonesiaResponse
import com.example.retrofit_tiwi_30.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}