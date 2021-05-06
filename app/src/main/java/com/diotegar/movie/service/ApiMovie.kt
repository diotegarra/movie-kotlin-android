package com.diotegar.movie.service

import android.net.wifi.rtt.CivicLocationKeys.LANGUAGE
import com.diotegar.movie.model.Movie
import io.reactivex.Observable
import com.diotegar.movie.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiMovie {

    @GET("movie/now_playing")
    fun getNowPlaying(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = BuildConfig.LANGUAGE,
        @Query("page") page: Int
    ): Observable<Movie>
}