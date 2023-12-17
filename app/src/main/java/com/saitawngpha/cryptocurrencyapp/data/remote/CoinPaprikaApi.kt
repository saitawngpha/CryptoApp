package com.saitawngpha.cryptocurrencyapp.data.remote

import com.saitawngpha.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.saitawngpha.cryptocurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 14/12/2023.
 */
interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins() : List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String) : CoinDetailDto
}