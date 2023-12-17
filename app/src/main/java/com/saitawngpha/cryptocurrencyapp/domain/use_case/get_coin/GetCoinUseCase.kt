package com.saitawngpha.cryptocurrencyapp.domain.use_case.get_coin

import com.saitawngpha.cryptocurrencyapp.common.Resource
import com.saitawngpha.cryptocurrencyapp.data.remote.dto.toCoin
import com.saitawngpha.cryptocurrencyapp.data.remote.dto.toCoinDetail
import com.saitawngpha.cryptocurrencyapp.domain.model.Coin
import com.saitawngpha.cryptocurrencyapp.domain.model.CoinDetail
import com.saitawngpha.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 15/12/2023.
 */
class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading<CoinDetail>())
            val coin = repository.getCoinById(coinId = coinId).toCoinDetail()
            emit(Resource.Success<CoinDetail>(coin))
        }catch (e: HttpException){
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An unexpected error occured."))
        }catch (e: IOException) {
            emit(Resource.Error<CoinDetail>("Couldn't reach server. Please check your internet connection."))
        }
    }
}