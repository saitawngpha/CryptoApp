package com.saitawngpha.cryptocurrencyapp.di

import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.savedstate.SavedStateRegistryOwner
import com.saitawngpha.cryptocurrencyapp.common.Constants.BASE_URL
import com.saitawngpha.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.saitawngpha.cryptocurrencyapp.data.repository.CoinRepositoryImpl
import com.saitawngpha.cryptocurrencyapp.domain.repository.CoinRepository
import com.saitawngpha.cryptocurrencyapp.domain.use_case.get_coin.GetCoinUseCase
import com.saitawngpha.cryptocurrencyapp.domain.use_case.get_coins.GetCoinsUseCase
import com.saitawngpha.cryptocurrencyapp.presentation.coin_detail.CoinDetailViewModel
import com.saitawngpha.cryptocurrencyapp.presentation.coin_list.CoinListViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 15/12/2023.
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi() : CoinPaprikaApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPaprikaApi): CoinRepository {
        return CoinRepositoryImpl(api = api)
    }
}