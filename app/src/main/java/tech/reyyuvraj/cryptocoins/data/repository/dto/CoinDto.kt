package tech.reyyuvraj.cryptocoins.data.repository.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import tech.reyyuvraj.cryptocoins.domain.model.Coin

@JsonClass(generateAdapter = true)
data class CoinDto(
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "is_active")
    val isActive: Boolean? = null,
    @Json(name = "is_new")
    val isNew: Boolean? = null,
    @Json(name = "name")
    val name: String? = null,
    @Json(name = "rank")
    val rank: Int? = null,
    @Json(name = "symbol")
    val symbol: String? = null,
    @Json(name = "type")
    val type: String? = null
)

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}