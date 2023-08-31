package com.pierretest.yugicardsapp.data.model


import com.google.gson.annotations.SerializedName

data class SingleCardModel(
    @SerializedName("data")
    val `data`: List<DataModel?>? = listOf()
)