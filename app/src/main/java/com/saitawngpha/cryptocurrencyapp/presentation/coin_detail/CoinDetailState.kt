package com.saitawngpha.cryptocurrencyapp.presentation.coin_detail

import com.saitawngpha.cryptocurrencyapp.domain.model.CoinDetail

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 15/12/2023.
 */
data class CoinDetailState (
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)