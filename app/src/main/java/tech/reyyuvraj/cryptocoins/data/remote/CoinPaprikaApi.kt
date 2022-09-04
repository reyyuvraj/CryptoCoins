package tech.reyyuvraj.cryptocoins.data.remote

import retrofit2.http.GET
import retrofit2.http.Path
import tech.reyyuvraj.cryptocoins.data.repository.dto.CoinDetailDto
import tech.reyyuvraj.cryptocoins.data.repository.dto.CoinDto

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String):CoinDetailDto
}