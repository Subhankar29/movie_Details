package com.example.swiggy.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.swiggy.R
import com.example.swiggy.model.MovieListViewStateSealed
import com.example.swiggy.model.SearchViewState
import com.example.swiggy.viewModel.GetMovieDetailsViewModel

class MainActivity : AppCompatActivity() {


    val movieDetailsViewModel =  GetMovieDetailsViewModel()

    val adapterData: ArrayList<SearchViewState> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerview()
    }


    private fun getMovieList(movieName: String) {
        movieDetailsViewModel.getMovieDetails(movieName).observe(this, Observer { state ->
            when (state) {
                is MovieListViewStateSealed.Loading -> {
                    showLoadingDialog()
                }

                is MovieListViewStateSealed.Success -> {
                    dismissLoadingDialog()
                    setUpRecyclerView()
                }

                is MovieListViewStateSealed.Error -> {
                    showErrorMessage()
                }
            }
        })
    }

    private fun initRecyclerview() {

    }

    private fun setUpRecyclerView() {
        // TODO ()
    }

    private fun showLoadingDialog() {
        // TODO ()
    }

    private fun dismissLoadingDialog() {
        // TODO ()
    }

    private fun showErrorMessage() {
        // TODO ()
    }
}
