package com.saitawngpha.cryptocurrencyapp.domain.model

import com.google.gson.annotations.SerializedName

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 14/12/2023.
 */
data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
