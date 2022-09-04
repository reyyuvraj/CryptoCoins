package tech.reyyuvraj.cryptocoins.domain.repository

import tech.reyyuvraj.cryptocoins.data.repository.dto.CoinDetailDto
import tech.reyyuvraj.cryptocoins.data.repository.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}