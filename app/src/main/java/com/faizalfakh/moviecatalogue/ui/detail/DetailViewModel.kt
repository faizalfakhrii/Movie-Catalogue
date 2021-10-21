package com.faizalfakh.moviecatalogue.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.faizalfakh.moviecatalogue.data.DataEntity
import com.faizalfakh.moviecatalogue.data.source.CatalogueRepository

class DetailViewModel(private val catalogueRepository: CatalogueRepository) : ViewModel() {

    fun getDetailMovie(movieId: Int): LiveData<DataEntity> = catalogueRepository.getMovieDetail(movieId)

    fun getDetailTvShow(tvshowId: Int): LiveData<DataEntity> = catalogueRepository.getTvShowDetail(tvshowId)

}