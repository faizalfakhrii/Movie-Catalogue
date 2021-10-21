package com.faizalfakh.moviecatalogue.data.source.remote

import com.faizalfakh.moviecatalogue.data.source.remote.api.ApiClient
import com.faizalfakh.moviecatalogue.data.source.remote.response.GenreResponse
import com.faizalfakh.moviecatalogue.data.source.remote.response.MovieResponse
import com.faizalfakh.moviecatalogue.data.source.remote.response.TVResponse
import com.faizalfakh.moviecatalogue.utils.EspressoIdlingResource
import com.faizalfakh.moviecatalogue.utils.Helper
import retrofit2.await

class RemoteDataSource(private val helper: Helper) {

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: Helper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper)
            }
    }

    fun getAllGenreMovies(): List<GenreResponse> = helper.loadGenreMovies()

    fun getAllGenreTvShow(): List<GenreResponse> = helper.loadGenreTVShow()

    suspend fun getPopularMovies(
        callback: LoadMoviesPopularCallback
    ) {
        EspressoIdlingResource.increment()
        ApiClient.getApiService().getPopularMovies().await().result?.let { listMovie ->
            callback.onAllMoviesReceived(
                listMovie
            )
            EspressoIdlingResource.decrement()
        }
    }

    suspend fun getMovieDetail(movieId: Int, callback: LoadMovieDetailCallback) {
        EspressoIdlingResource.increment()
        ApiClient.getApiService().getDetailMovie(movieId).await().let { movie ->
            callback.onMovieDetailReceived(
                movie
            )
            EspressoIdlingResource.decrement()
        }
    }

    suspend fun getPopularTvShow(callback: LoadTvShowPopularCallback) {
        EspressoIdlingResource.increment()
        ApiClient.getApiService().getPopularTvShow().await().result?.let { listTvShow ->
            callback.onAllTvShowsReceived(
                listTvShow
            )
            EspressoIdlingResource.decrement()
        }
    }

    suspend fun getTvShowDetail(tvShowId: Int, callback: LoadTvShowDetailCallback) {
        EspressoIdlingResource.increment()
        ApiClient.getApiService().getDetailTvShow(tvShowId).await().let { tvShow ->
            callback.onTvShowDetailReceived(
                tvShow
            )
            EspressoIdlingResource.decrement()
        }
    }

    interface LoadMoviesPopularCallback {
        fun onAllMoviesReceived(movieResponse: List<MovieResponse>)
    }

    interface LoadMovieDetailCallback {
        fun onMovieDetailReceived(movieResponse: MovieResponse)
    }

    interface LoadTvShowPopularCallback {
        fun onAllTvShowsReceived(tvShowResponse: List<TVResponse>)
    }

    interface LoadTvShowDetailCallback {
        fun onTvShowDetailReceived(tvShowResponse: TVResponse)
    }

}