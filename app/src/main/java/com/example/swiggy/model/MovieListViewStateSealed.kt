package com.example.swiggy.model

sealed class MovieListViewStateSealed {

    object Loading: MovieListViewStateSealed()

    data class Success(val searchViewState: List<SearchViewState>) : MovieListViewStateSealed()

    data class Error(val error: String) : MovieListViewStateSealed()

    data class DoNothing() : MovieListViewStateSealed()

}
