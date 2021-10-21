package com.faizalfakh.moviecatalogue.ui.main.content.tvshow

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
class TvShowViewModelTest {

    private val dummyTvShow = DataDummy.generateTvShow()

    private lateinit var viewModel: TvShowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogueRepository: CatalogueRepository

    @Mock
    private lateinit var observer: Observer<List<DataEntity>>

    @Before
    fun setUp() {
        viewModel = TvShowViewModel(catalogueRepository)
    }
    @Test
    fun getListTvShow() {
        val movie = MutableLiveData<List<DataEntity>>()
        movie.value = dummyTvShow

        Mockito.`when`(catalogueRepository.getPopularTvShow()).thenReturn(movie)

        val dataListTvShow = viewModel.getTvShow().value

        verify(catalogueRepository).getPopularTvShow()
        assertNotNull(dataListTvShow)
        assertEquals(10, dataListTvShow?.size)

        viewModel.getTvShow().observeForever(observer)
        verify(observer).onChanged(dummyTvShow)
    }
}