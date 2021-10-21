package com.faizalfakh.moviecatalogue.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.faizalfakh.moviecatalogue.data.DataEntity
import com.faizalfakh.moviecatalogue.data.source.remote.RemoteDataSource
import com.faizalfakh.moviecatalogue.data.source.remote.response.GenreResponse
import com.faizalfakh.moviecatalogue.data.source.remote.response.MovieResponse
import com.faizalfakh.moviecatalogue.data.source.remote.response.TVResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CatalogueRepository (private val remoteDataSource: RemoteDataSource) : CatalogueDataSource {

    companion object {
        @Volatile
        private var instance: CatalogueRepository? = null

        fun getInstance(remoteDataSource: RemoteDataSource): CatalogueRepository =
            instance ?: synchronized(this) {
                instance ?: CatalogueRepository(remoteDataSource)
            }
    }

    override fun getAllGenreMovies(): ArrayList<GenreResponse> {
        val genreResponses = remoteDataSource.getAllGenreMovies()
        val genreList = ArrayList<GenreResponse>()
        for (response in genreResponses) {
            val genre = GenreResponse(
                response.id,
                response.name
            )
            genreList.add(genre)
        }
        return genreList
    }

    override fun getAllGenreTvShow(): ArrayList<GenreResponse> {
        val genreResponses = remoteDataSource.getAllGenreTvShow()
        val genreList = ArrayList<GenreResponse>()
        for (response in genreResponses) {
            val genre = GenreResponse(
                response.id,
                response.name
            )
            genreList.add(genre)
        }
        return genreList
    }

    override fun getPopularMovies(): LiveData<List<DataEntity>> {
        val listMovieResult = MutableLiveData<List<DataEntity>>()
        CoroutineScope(Dispatchers.IO).launch {
            remoteDataSource.getPopularMovies(object :
                RemoteDataSource.LoadMoviesPopularCallback {
                override fun onAllMoviesReceived(movieResponse: List<MovieResponse>) {
                    val movieList = ArrayList<DataEntity>()
                    for (response in movieResponse){

                        val allGenre = getAllGenreMovies()
                        val listGenre: ArrayList<String> = ArrayList()
                        for (i in allGenre.indices){
                            for(j in response.genres?.indices!!){
                                if (response.genres!![j] == allGenre[i].id) {
                                    listGenre.add(allGenre[i].name.toString())
                                }
                            }
                        }

                        val movie = DataEntity(
                            response.id,
                            response.title,
                            listGenre,
                            null,
                            response.rating,
                            response.description,
                            response.image
                        )
                        movieList.add(movie)
                    }
                    listMovieResult.postValue(movieList)
                }
            })
        }

        return listMovieResult
    }

    override fun getMovieDetail(movieId: Int): LiveData<DataEntity> {
        val movieResult = MutableLiveData<DataEntity>()
        CoroutineScope(Dispatchers.IO).launch {
            remoteDataSource.getMovieDetail(movieId, object :
                RemoteDataSource.LoadMovieDetailCallback {
                override fun onMovieDetailReceived(movieResponse: MovieResponse) {

                    val genres: ArrayList<String> = ArrayList()
                    for(i in movieResponse.genreDetail?.indices!!){
                        val item = movieResponse.genreDetail!![i].name
                        if (!item.isNullOrEmpty()) {
                            genres.add(item)
                        }
                    }

                    val movie = DataEntity(
                        movieResponse.id,
                        movieResponse.title,
                        genres,
                        movieResponse.duration,
                        movieResponse.rating,
                        movieResponse.description,
                        movieResponse.image
                    )
                    movieResult.postValue(movie)
                }
            })
        }

        return movieResult
    }

    override fun getPopularTvShow(): LiveData<List<DataEntity>> {
        val listTvShowResult = MutableLiveData<List<DataEntity>>()
        CoroutineScope(Dispatchers.IO).launch {
            remoteDataSource.getPopularTvShow(object :
                RemoteDataSource.LoadTvShowPopularCallback {
                override fun onAllTvShowsReceived(tvShowResponse: List<TVResponse>) {
                    val tvShowList = ArrayList<DataEntity>()
                    for (response in tvShowResponse){

                        val allGenre = getAllGenreTvShow()
                        val listGenre: ArrayList<String> = ArrayList()
                        for (i in allGenre.indices){
                            for(j in response.genres?.indices!!){
                                if (response.genres!![j] == allGenre[i].id){
                                    listGenre.add(allGenre[i].name.toString())
                                }
                            }
                        }

                        val tvShow = DataEntity(
                            response.id,
                            response.title,
                            listGenre,
                            null,
                            response.rating,
                            response.description,
                            response.image
                        )
                        tvShowList.add(tvShow)
                    }
                    listTvShowResult.postValue(tvShowList)
                }
            })
        }

        return listTvShowResult
    }

    override fun getTvShowDetail(tvShowId: Int): LiveData<DataEntity> {
        val tvShowResult = MutableLiveData<DataEntity>()
        CoroutineScope(Dispatchers.IO).launch {
            remoteDataSource.getTvShowDetail(tvShowId, object :
                RemoteDataSource.LoadTvShowDetailCallback {
                override fun onTvShowDetailReceived(tvShowResponse: TVResponse) {

                    val genres: ArrayList<String> = ArrayList()
                    for(i in tvShowResponse.genreDetail?.indices!!){
                        val item = tvShowResponse.genreDetail!![i].name
                        if (!item.isNullOrEmpty()) {
                            genres.add(item)
                        }
                    }
                    val tvShow = DataEntity(
                        tvShowResponse.id,
                        tvShowResponse.title,
                        genres,
                        tvShowResponse.duration?.get(0),
                        tvShowResponse.rating,
                        tvShowResponse.description,
                        tvShowResponse.image
                    )
                    tvShowResult.postValue(tvShow)
                }
            })
        }
        return tvShowResult
    }
}