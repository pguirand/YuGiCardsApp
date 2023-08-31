package com.pierretest.yugicardsapp.data.model


import com.google.gson.annotations.SerializedName

data class CardSetModel(
    @SerializedName("set_code")
    val setCode: String? = "",
    @SerializedName("set_name")
    val setName: String? = "",
    @SerializedName("set_price")
    val setPrice: String? = "",
    @SerializedName("set_rarity")
    val setRarity: String? = "",
    @SerializedName("set_rarity_code")
    val setRarityCode: String? = ""
)