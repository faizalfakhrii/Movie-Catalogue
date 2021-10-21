package com.faizalfakh.moviecatalogue.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MovieResponse (
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("title")
    var title: String? = null,
    @SerializedName("overview")
    var description: String? = null,
    @SerializedName("poster_path")
    var image: String? = null,
    @SerializedName("genre_ids")
    var genres: List<Int>? = null,
    @SerializedName("genres")
    var genreDetail: List<GenreResponse>? = null,
    @SerializedName("vote_average")
    var rating: Float? = null,
    @SerializedName("runtime")
    var duration: Int? = null
)