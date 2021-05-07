package com.diotegar.movie.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.diotegar.movie.data.DataModel
import com.diotegar.movie.data.source.CatalogRepository

class HomeViewModel(private val catalogRepository: CatalogRepository) : ViewModel() {

    fun getListNowPlayingMovies(): LiveData<List<DataModel>> = catalogRepository.getNowPlayingMovies()

    fun getListOnTheAirTvShows(): LiveData<List<DataModel>> = catalogRepository.getTvShowOnTheAir()

}