package com.mr.movieapp

import com.mr.movieapp.network.MovieApi
import com.mr.movieapp.network.model.MovieResponse


class MovieSDK {
    private val movieApi = MovieApi()

    @Throws(Exception::class)
    suspend fun getPopularMovies(): MovieResponse {
        val popularMovieResponse = movieApi.getPopularMovies()
        return if (popularMovieResponse != null) {
            popularMovieResponse
        } else {
            throw NullPointerException()
        }
    }
}