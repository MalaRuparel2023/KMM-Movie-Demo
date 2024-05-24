package com.mr.movieapp.network

import com.mr.movieapp.network.AppConstant.API_KEY
import com.mr.movieapp.network.AppConstant.BASE_URL
import com.mr.movieapp.network.model.MovieResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json


class MovieApi {
    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
                coerceInputValues = true
            })
        }
    }

    suspend fun getPopularMovies(): MovieResponse? {
        return httpClient.get("${BASE_URL}/popular?api_key=${API_KEY}").body()
    }

}