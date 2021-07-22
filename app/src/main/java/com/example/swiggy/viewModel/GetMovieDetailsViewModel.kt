package com.example.swiggy.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.swiggy.Utils.ConstantsMovieList.BASE_URL
import com.example.swiggy.Utils.ConstantsMovieList.MOVIE_LIST_END_POINT
import com.example.swiggy.Utils.ConstantsMovieList.SEARCH_STRING_KEY
import com.example.swiggy.model.MovieDetailsDataViewState
import com.example.swiggy.model.MovieListDetailsRepository
import com.example.swiggy.model.MovieListViewStateSealed
import io.reactivex.disposables.CompositeDisposable

class GetMovieDetailsViewModel() {

    private val disposable = CompositeDisposable()
    private val movieListDetailsRepository = MovieListDetailsRepository()


    fun getMovieDetails(movieName: String) : LiveData<MovieListViewStateSealed> {
        val movieDetailsLiveDate = MutableLiveData<MovieListViewStateSealed>()

        val getMovieListUrl = BASE_URL + MOVIE_LIST_END_POINT.replace(SEARCH_STRING_KEY, movieName)

        disposable.add(movieListDetailsRepository.getMovieList(getMovieListUrl).subscribe ({
            movieDetailsLiveDate.value = it
            } , { throwable ->
            movieDetailsLiveDate.value = MovieListViewStateSealed.Error("Error")
        }))
        return movieDetailsLiveDate
    }


}
