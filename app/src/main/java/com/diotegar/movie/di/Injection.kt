package com.diotegar.movie.di

import com.diotegar.movie.data.source.CatalogRepository
import com.diotegar.movie.data.source.remote.RemoteDataSource

object Injection {

    fun provideCatalogRepository(): CatalogRepository {
        val remoteDataSource = RemoteDataSource.getInstance()
        return CatalogRepository.getInstance(remoteDataSource)
    }
}