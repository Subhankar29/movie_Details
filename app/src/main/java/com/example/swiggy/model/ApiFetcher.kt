package com.example.swiggy.model

import io.reactivex.Single

class ApiFetcher(private val getMovieBackend: GetMovieBackend) : ApiFetcherBase {

    override fun getMovieList(url: String): Single<MovieListResponse> {
        return getMovieBackend.getMovieList(url)
    }


}
