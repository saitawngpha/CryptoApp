package com.saitawngpha.cryptocurrencyapp.domain.repository

import com.saitawngpha.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.saitawngpha.cryptocurrencyapp.data.remote.dto.CoinDto

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 15/12/2023.
 */
interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}