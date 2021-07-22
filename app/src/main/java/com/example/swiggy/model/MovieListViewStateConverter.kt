package com.example.swiggy.model

class MovieListViewStateConverter :  Converter<MovieListResponse, MovieListResponseViewState> {

    fun apply(movieListResponse : MovieListResponse) : MovieListResponseViewState {

        val movieList = movieListResponse.Search

        val movieListData = mutableListOf<SearchViewState>()

        if (movieList.isNotEmpty()) {
            movieList.forEach{ movieItem ->
                movieListData.add(
                    SearchViewState(
                        movieItem.Title.orEmpty(),
                        movieItem.Year.orEmpty(),
                        movieItem.imdbID.orEmpty(),
                        movieItem.Type.orEmpty(),
                        movieItem.Poster.orEmpty()
                    )
                )
            }
        }
        return MovieListResponseViewState(movieListData)
    }

}
