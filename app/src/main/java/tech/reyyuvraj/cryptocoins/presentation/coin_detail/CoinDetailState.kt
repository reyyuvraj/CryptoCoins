package tech.reyyuvraj.cryptocoins.presentation.coin_detail

import tech.reyyuvraj.cryptocoins.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
