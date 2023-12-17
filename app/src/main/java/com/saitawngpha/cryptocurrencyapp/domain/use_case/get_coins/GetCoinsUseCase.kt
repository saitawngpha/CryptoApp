package com.saitawngpha.cryptocurrencyapp.domain.use_case.get_coins

import com.saitawngpha.cryptocurrencyapp.common.Resource
import com.saitawngpha.cryptocurrencyapp.data.remote.dto.toCoin
import com.saitawngpha.cryptocurrencyapp.domain.model.Coin
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
class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        }catch (e: HttpException){
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "An unexpected error occured."))
        }catch (e: IOException) {
            emit(Resource.Error<List<Coin>>("Couldn't reach server. Please check your internet connection."))
        }
    }
}