package com.diotegar.movie.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.diotegar.movie.data.DataModel
import com.diotegar.movie.data.source.CatalogRepository

class DetailViewModel(private val catalogRepository: CatalogRepository) : ViewModel() {

    fun getMovieDetail(movieId: Int): LiveData<DataModel> =
        catalogRepository.getMovieDetail(movieId)

    fun getTvShowDetail(tvShowId: Int): LiveData<DataModel> = catalogRepository.getTvShowDetail(
        tvShowId
    )
}