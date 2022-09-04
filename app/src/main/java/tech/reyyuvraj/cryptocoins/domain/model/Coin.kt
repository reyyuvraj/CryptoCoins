package tech.reyyuvraj.cryptocoins.domain.model

import tech.reyyuvraj.cryptocoins.data.repository.dto.CoinDto

data class Coin(
    val id: String? = null,
    val isActive: Boolean? = null,
    val name: String? = null,
    val rank: Int? = null,
    val symbol: String? = null
)
