package tech.reyyuvraj.cryptocoins.presentation.coin_list

import tech.reyyuvraj.cryptocoins.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
