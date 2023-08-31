package com.pierretest.yugicardsapp.data.repository

import com.pierretest.yugicardsapp.data.model.DataModel

interface Repository {

    suspend fun getRandomCard() : DataModel

    suspend fun getCardById(idCard : Int) : DataModel
}

