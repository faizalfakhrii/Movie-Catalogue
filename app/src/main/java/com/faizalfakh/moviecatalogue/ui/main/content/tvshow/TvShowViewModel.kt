package com.faizalfakh.moviecatalogue.ui.main.content.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.faizalfakh.moviecatalogue.data.DataEntity
import com.faizalfakh.moviecatalogue.data.source.CatalogueRepository

class TvShowViewModel(private val catalogueRepository: CatalogueRepository): ViewModel() {
    fun getTvShow() : LiveData<List<DataEntity>> = catalogueRepository.getPopularTvShow()
}