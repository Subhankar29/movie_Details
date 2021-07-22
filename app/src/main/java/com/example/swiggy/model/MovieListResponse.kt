package com.example.swiggy.model

data class MovieListResponse(
    val Search: List<Search>
)

data class Search(
    val Title: String?,
    val Year: String?,
    val imdbID: String?,
    val Type: String?,
    val Poster: String?
)
