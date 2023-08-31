package com.pierretest.yugicardsapp.data.remote

import com.pierretest.yugicardsapp.common.ApiDetails
import com.pierretest.yugicardsapp.data.model.DataModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiCall {

    @GET(ApiDetails.RANDOM_CARD_ENDPOINT)
    suspend fun getRandomCard() : DataModel

    @GET(ApiDetails.SINGLE_CARD_ENDPOINT)
    suspend fun getCardById(@Query("id")id:Int) : DataModel
}