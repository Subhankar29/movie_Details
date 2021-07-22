package com.example.swiggy.model

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Url

interface GetMovieBackend {

    @GET
    fun getMovieList(@Url url: String): Single<MovieListResponse>
}
