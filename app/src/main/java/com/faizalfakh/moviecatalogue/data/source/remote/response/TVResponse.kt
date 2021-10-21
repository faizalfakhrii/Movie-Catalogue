package com.faizalfakh.moviecatalogue.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class TVResponse (
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("name")
    var title: String? = null,
    @SerializedName("overview")
    var description: String? = null,
    @SerializedName("poster_path")
    var image: String? = null,
    @SerializedName("genre_ids")
    var genres: List<Int>?,
    @SerializedName("genres")
    var genreDetail: List<GenreResponse>?,
    @SerializedName("vote_average")
    var rating: Float? = null,
    @SerializedName("episode_run_time")
    val duration: List<Int?>? = null
)