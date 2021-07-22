package com.example.swiggy.model

import com.example.swiggy.model.ApiFetcher
import io.reactivex.Observable

class MovieListDetailsRepository()

    private val apiFetcher = ApiFetcher()
    private val movieListViewStateConverter = MovieListViewStateConverter()
    fun getMovieList(url: String): Observable<MovieListViewStateSealed> {
            return apiFetcher.getMovieList(url)
                .map(movieListViewStateConverter)
                .toObservable()
                .startWith(MovieListViewStateSealed.Loading)
                .compose(schedulingStrategyFactory.create())
    }
}
