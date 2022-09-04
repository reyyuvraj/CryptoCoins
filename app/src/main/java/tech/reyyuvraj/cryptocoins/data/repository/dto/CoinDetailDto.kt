package tech.reyyuvraj.cryptocoins.data.repository.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import tech.reyyuvraj.cryptocoins.domain.model.CoinDetail

@JsonClass(generateAdapter = true)
data class CoinDetailDto(
    @Json(name = "description")
    val description: String? = null,
    @Json(name = "development_status")
    val developmentStatus: String? = null,
    @Json(name = "first_data_at")
    val firstDataAt: String? = null,
    @Json(name = "hardware_wallet")
    val hardwareWallet: Boolean? = null,
    @Json(name = "hash_algorithm")
    val hashAlgorithm: String? = null,
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "is_active")
    val isActive: Boolean? = null,
    @Json(name = "is_new")
    val isNew: Boolean? = null,
    @Json(name = "last_data_at")
    val lastDataAt: String? = null,
    @Json(name = "links")
    val links: Links? = null,
    @Json(name = "links_extended")
    val linksExtended: List<LinksExtended?>? = null,
    @Json(name = "message")
    val message: String? = null,
    @Json(name = "name")
    val name: String? = null,
    @Json(name = "open_source")
    val openSource: Boolean? = null,
    @Json(name = "org_structure")
    val orgStructure: String? = null,
    @Json(name = "proof_type")
    val proofType: String? = null,
    @Json(name = "rank")
    val rank: Int? = null,
    @Json(name = "started_at")
    val startedAt: String? = null,
    @Json(name = "symbol")
    val symbol: String? = null,
    @Json(name = "tags")
    val tags: List<Tag?>? = null,
    @Json(name = "team")
    val team: List<TeamMember?>? = null,
    @Json(name = "type")
    val type: String? = null,
    @Json(name = "whitepaper")
    val whitepaper: Whitepaper? = null
) {
    @JsonClass(generateAdapter = true)
    data class Links(
        @Json(name = "explorer")
        val explorer: List<String?>? = null,
        @Json(name = "facebook")
        val facebook: List<String?>? = null,
        @Json(name = "reddit")
        val reddit: List<String?>? = null,
        @Json(name = "source_code")
        val sourceCode: List<String?>? = null,
        @Json(name = "website")
        val website: List<String?>? = null,
        @Json(name = "youtube")
        val youtube: List<String?>? = null
    )

    @JsonClass(generateAdapter = true)
    data class LinksExtended(
        @Json(name = "stats")
        val stats: Stats? = null,
        @Json(name = "type")
        val type: String? = null,
        @Json(name = "url")
        val url: String? = null
    ) {
        @JsonClass(generateAdapter = true)
        data class Stats(
            @Json(name = "contributors")
            val contributors: Int? = null,
            @Json(name = "followers")
            val followers: Int? = null,
            @Json(name = "stars")
            val stars: Int? = null,
            @Json(name = "subscribers")
            val subscribers: Int? = null
        )
    }

    @JsonClass(generateAdapter = true)
    data class Tag(
        @Json(name = "coin_counter")
        val coinCounter: Int? = null,
        @Json(name = "ico_counter")
        val icoCounter: Int? = null,
        @Json(name = "id")
        val id: String? = null,
        @Json(name = "name")
        val name: String? = null
    )

    @JsonClass(generateAdapter = true)
    data class TeamMember(
        @Json(name = "id")
        val id: String? = null,
        @Json(name = "name")
        val name: String? = null,
        @Json(name = "position")
        val position: String? = null
    )

    @JsonClass(generateAdapter = true)
    data class Whitepaper(
        @Json(name = "link")
        val link: String? = null,
        @Json(name = "thumbnail")
        val thumbnail: String? = null
    )
}

fun CoinDetailDto.toCoinDetail(): CoinDetail {
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isActive = isActive,
        tags = tags?.map { it?.name },
        team = team
    )
}