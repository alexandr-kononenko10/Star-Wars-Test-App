package com.example.starwarstestproject.presentation.firstscreen

import com.example.starwarstestproject.domain.MovieDto

sealed class FirstScreenState {

    object Loading : FirstScreenState()

    class Results(val items:List<MovieDto>) : FirstScreenState()
}