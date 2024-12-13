package com.manodev.mvvmmoviesapproomdb.details.presentation

import com.manodev.mvvmmoviesapproomdb.movielist.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
