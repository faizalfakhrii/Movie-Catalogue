package com.faizalfakh.moviecatalogue.di

import android.content.Context
import com.faizalfakh.moviecatalogue.data.source.CatalogueRepository
import com.faizalfakh.moviecatalogue.data.source.remote.RemoteDataSource
import com.faizalfakh.moviecatalogue.utils.Helper

object Injection {
    fun provideCatalogRepository(context: Context): CatalogueRepository {
        val remoteDataSource = RemoteDataSource.getInstance(Helper(context))
        return CatalogueRepository.getInstance(remoteDataSource)}
}