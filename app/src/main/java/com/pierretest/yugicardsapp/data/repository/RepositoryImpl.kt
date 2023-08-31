package com.pierretest.yugicardsapp.data.repository

import com.pierretest.yugicardsapp.data.model.DataModel
import com.pierretest.yugicardsapp.data.remote.ApiCall

class RepositoryImpl (val apiCall: ApiCall) : Repository{
    override suspend fun getRandomCard(): DataModel {
        return apiCall.getRandomCard()
    }

    override suspend fun getCardById(idCard: Int): DataModel {
        return apiCall.getCardById(idCard)
    }

}