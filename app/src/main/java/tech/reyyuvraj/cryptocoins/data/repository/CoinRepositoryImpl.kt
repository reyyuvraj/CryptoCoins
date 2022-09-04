package tech.reyyuvraj.cryptocoins.data.repository

import tech.reyyuvraj.cryptocoins.data.remote.CoinPaprikaApi
import tech.reyyuvraj.cryptocoins.data.repository.dto.CoinDetailDto
import tech.reyyuvraj.cryptocoins.data.repository.dto.CoinDto
import tech.reyyuvraj.cryptocoins.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}