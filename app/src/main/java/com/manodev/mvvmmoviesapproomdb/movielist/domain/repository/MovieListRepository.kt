package com.manodev.mvvmmoviesapproomdb.movielist.domain.repository

import com.manodev.mvvmmoviesapproomdb.movielist.domain.model.Movie
import com.manodev.mvvmmoviesapproomdb.movielist.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}