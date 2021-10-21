package com.faizalfakh.moviecatalogue.data.source

import androidx.lifecycle.LiveData
import com.faizalfakh.moviecatalogue.data.DataEntity
import com.faizalfakh.moviecatalogue.data.source.remote.response.GenreResponse

interface CatalogueDataSource {

    fun getAllGenreMovies(): List<GenreResponse>

    fun getAllGenreTvShow(): List<GenreResponse>

    fun getPopularMovies(): LiveData<List<DataEntity>>

    fun getMovieDetail(movieId: Int): LiveData<DataEntity>

    fun getPopularTvShow(): LiveData<List<DataEntity>>

    fun getTvShowDetail(tvShowId: Int): LiveData<DataEntity>

}