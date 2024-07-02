package com.example.starwarstestproject.presentation.firstscreen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@HiltViewModel
class FirstScreenViewModel:ViewModel() {

    private val _state = MutableStateFlow<FirstScreenState>(FirstScreenState.Loading)
    val  state = _state.asStateFlow()


}