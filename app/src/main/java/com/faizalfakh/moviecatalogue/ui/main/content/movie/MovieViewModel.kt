package com.faizalfakh.moviecatalogue.ui.main.content.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.faizalfakh.moviecatalogue.data.DataEntity
import com.faizalfakh.moviecatalogue.data.source.CatalogueRepository

class MovieViewModel(private val catalogueRepository: CatalogueRepository) : ViewModel(){
    fun getMovies() : LiveData<List<DataEntity>> = catalogueRepository.getPopularMovies()

}