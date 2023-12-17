package com.saitawngpha.cryptocurrencyapp.presentation

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 15/12/2023.
 */
sealed class Screen(val route: String) {
    object CoinListScreen: Screen(route = "coin_list_screen")
    object CoinDetailScreen: Screen(route = "coin_detail_screen")
}
