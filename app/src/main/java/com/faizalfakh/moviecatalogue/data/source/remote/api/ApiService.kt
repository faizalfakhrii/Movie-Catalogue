package com.faizalfakh.moviecatalogue.data.source.remote.api

import com.faizalfakh.moviecatalogue.data.source.remote.response.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "95a598164f80ee2788c8e2a9829993aa"
    ) : Call<ListResponse<MovieResponse>>

    @GET("movie/{movie_id}")
    fun getDetailMovie(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = "95a598164f80ee2788c8e2a9829993aa"
    ) : Call<MovieResponse>

    @GET("tv/popular")
    fun getPopularTvShow(
        @Query("api_key") apiKey: String = "95a598164f80ee2788c8e2a9829993aa"
    ) : Call<ListResponse<TVResponse>>

    @GET("tv/{tv_id}")
    fun getDetailTvShow(
        @Path("tv_id") tvShowId: Int,
        @Query("api_key") apiKey: String = "95a598164f80ee2788c8e2a9829993aa"
    ) : Call<TVResponse>

}