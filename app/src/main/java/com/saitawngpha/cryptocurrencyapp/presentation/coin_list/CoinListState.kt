package com.saitawngpha.cryptocurrencyapp.presentation.coin_list

import com.saitawngpha.cryptocurrencyapp.domain.model.Coin

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 15/12/2023.
 */
data class CoinListState (
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)