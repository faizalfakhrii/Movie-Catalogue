package com.faizalfakh.moviecatalogue.ui.main.content.movie

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
class MovieViewModelTest {

    private val dummyMovie = DataDummy.generateMovies()

    private lateinit var viewModel: MovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogueRepository: CatalogueRepository

    @Mock
    private lateinit var observer: Observer<List<DataEntity>>

    @Before
    fun setUp() {
        viewModel = MovieViewModel(catalogueRepository)
    }
    @Test
    fun getListMovie() {
        val movie = MutableLiveData<List<DataEntity>>()
        movie.value = dummyMovie

        Mockito.`when`(catalogueRepository.getPopularMovies()).thenReturn(movie)

        val dataListMovie = viewModel.getMovies().value

        verify(catalogueRepository).getPopularMovies()
        assertNotNull(dataListMovie)
        assertEquals(11, dataListMovie?.size)

        viewModel.getMovies().observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }

}