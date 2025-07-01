package com.example.catfacts
import retrofit2.http.GET
import retrofit2.Response

interface CatFactApi {
    @GET("fact")
    suspend fun getRandomCatFacts(): Response<CatFact>
}