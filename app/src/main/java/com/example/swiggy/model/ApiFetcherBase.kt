package com.example.swiggy.model

import com.example.swiggy.model.MovieListResponse
import io.reactivex.Single

interface ApiFetcherBase {
    fun getMovieList(url: String) : Single<MovieListResponse>
}
