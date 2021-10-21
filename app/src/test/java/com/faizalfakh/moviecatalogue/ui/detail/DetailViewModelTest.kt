package com.faizalfakh.moviecatalogue.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.faizalfakh.moviecatalogue.data.DataEntity
import com.faizalfakh.moviecatalogue.data.source.CatalogueRepository
import com.faizalfakh.moviecatalogue.utils.DataDummy
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = DataDummy.generateMovies()[0]
    private val dummyTvShow = DataDummy.generateTvShow()[0]
    private val movieId = dummyMovie.id
    private val tvId = dummyTvShow.id

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogueRepository: CatalogueRepository

    @Mock
    private lateinit var observer: Observer<DataEntity>


    @Before
    fun setUp() {
        viewModel = DetailViewModel(catalogueRepository)
    }

    @Test
    fun getDetailMovie() {
        val movie = MutableLiveData<DataEntity>()
        movie.value = dummyMovie

        Mockito.`when`(movieId?.let { catalogueRepository.getMovieDetail(it) }).thenReturn(movie)

        val data = movieId?.let { viewModel.getDetailMovie(it).value } as DataEntity

        assertNotNull(movie)
        assertEquals(dummyMovie.id, data.id)
        assertEquals(dummyMovie.genres, data.genres)
        assertEquals(dummyMovie.rating, data.rating)
        assertEquals(dummyMovie.duration, data.duration)
        assertEquals(dummyMovie.description, data.description)
        assertEquals(dummyMovie.image, data.image)

        viewModel.getDetailMovie(movieId).observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }

    @Test
    fun getDetailTvShow() {
        val tvShow = MutableLiveData<DataEntity>()
        tvShow.value = dummyTvShow

        Mockito.`when`(tvId?.let { catalogueRepository.getTvShowDetail(it) }).thenReturn(tvShow)

        val data = tvId?.let { viewModel.getDetailTvShow(it).value } as DataEntity

        assertNotNull(tvShow)
        assertEquals(dummyTvShow.id, data.id)
        assertEquals(dummyTvShow.genres, data.genres)
        assertEquals(dummyTvShow.rating, data.rating)
        assertEquals(dummyTvShow.duration, data.duration)
        assertEquals(dummyTvShow.description, data.description)
        assertEquals(dummyTvShow.image, data.image)

        viewModel.getDetailTvShow(tvId).observeForever(observer)
        verify(observer).onChanged(dummyTvShow)
    }
}