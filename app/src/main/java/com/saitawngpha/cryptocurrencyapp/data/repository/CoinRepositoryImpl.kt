package com.saitawngpha.cryptocurrencyapp.data.repository

import com.saitawngpha.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.saitawngpha.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.saitawngpha.cryptocurrencyapp.data.remote.dto.CoinDto
import com.saitawngpha.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 15/12/2023.
 */
class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository{
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId = coinId)
    }
}