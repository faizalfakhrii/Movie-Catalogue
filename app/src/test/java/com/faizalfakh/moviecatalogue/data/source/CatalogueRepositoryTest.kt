package com.faizalfakh.moviecatalogue.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.faizalfakh.moviecatalogue.LiveDataTestUtil
import com.faizalfakh.moviecatalogue.data.source.remote.RemoteDataSource
import com.faizalfakh.moviecatalogue.utils.DataDummy
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.verify
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito

class CatalogueRepositoryTest{

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = Mockito.mock(RemoteDataSource::class.java)
    private val catalogRepository = FakeCatalogueRepository(remote)

    private val listMovieResponse = DataDummy.generateRemoteMovies()
    private val movieId = listMovieResponse[0].id
    private val listTvShowResponse = DataDummy.generateRemoteTvShow()
    private val tvShowId = listTvShowResponse[0].id
    private val movieResponse = DataDummy.generateRemoteMovies()[0]
    private val tvShowResponse = DataDummy.generateRemoteTvShow()[0]

    @Test
    fun getPopularMovies() {
        runBlocking {
            doAnswer {invocation ->
                (invocation.arguments[0] as RemoteDataSource.LoadMoviesPopularCallback).onAllMoviesReceived(listMovieResponse)
                null
            }.`when`(remote).getPopularMovies(any())
        }

        val data = LiveDataTestUtil.getValue(catalogRepository.getPopularMovies())

        runBlocking {
            verify(remote).getPopularMovies(any())
        }

        assertNotNull(data)
        assertEquals(listMovieResponse.size.toLong(), data.size.toLong())
    }

    @Test
    fun getMovieDetail() {
        runBlocking {
            doAnswer {invocation ->
                (invocation.arguments[1] as RemoteDataSource.LoadMovieDetailCallback).onMovieDetailReceived(movieResponse)
                null
            }.`when`(remote).getMovieDetail(eq(movieId), any())
        }

        val data = LiveDataTestUtil.getValue(catalogRepository.getMovieDetail(movieId))

        runBlocking {
            verify(remote).getMovieDetail(eq(movieId), any())
        }

        assertNotNull(data)
        assertEquals(movieResponse.id, data.id)
    }

    @Test
    fun getPopularTvShow() {
        runBlocking {
            doAnswer { invocation ->
                (invocation.arguments[0] as RemoteDataSource.LoadTvShowPopularCallback).onAllTvShowsReceived(listTvShowResponse)
                null
            }.`when`(remote).getPopularTvShow(any())
        }

        val data = LiveDataTestUtil.getValue(catalogRepository.getPopularTvShow())

        runBlocking {
            verify(remote).getPopularTvShow(any())
        }

        assertNotNull(data)
        assertEquals(listTvShowResponse.size.toLong(), data.size.toLong())
    }

    @Test
    fun getTvShowDetail() {
        runBlocking {
            doAnswer {invocation ->
                (invocation.arguments[1] as RemoteDataSource.LoadTvShowDetailCallback).onTvShowDetailReceived(tvShowResponse)
                null
            }.`when`(remote).getTvShowDetail(eq(tvShowId), any())
        }

        val data = LiveDataTestUtil.getValue(catalogRepository.getTvShowDetail(tvShowId))

        runBlocking {
            verify(remote).getTvShowDetail(eq(tvShowId), any())
        }

        assertNotNull(data)
        assertEquals(tvShowResponse.id, data.id)
    }
}