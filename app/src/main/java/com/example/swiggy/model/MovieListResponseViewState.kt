package com.example.swiggy.model

data class MovieListResponseViewState(
    val SearchViewState: List<SearchViewState>
)

data class SearchViewState(
    val Title: String,
    val Year: String,
    val imdbID: String,
    val Type: String,
    val Poster: String
) {
    companion object{
        val EMPTY = ""
    }
}
