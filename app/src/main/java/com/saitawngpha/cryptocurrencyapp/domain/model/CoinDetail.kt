package com.saitawngpha.cryptocurrencyapp.domain.model

import com.saitawngpha.cryptocurrencyapp.data.remote.dto.CoinDetailDto.TeamMember

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 14/12/2023.
 */
data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
