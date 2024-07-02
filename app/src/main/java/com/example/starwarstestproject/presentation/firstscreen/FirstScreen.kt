package com.example.starwarstestproject.presentation.firstscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.starwarstestproject.domain.MovieDto

@Composable
fun FirstScreen(viewModel: FirstScreenViewModel){

    val state = viewModel.state.collectAsState()

    when(val currentState = state.value){

        is FirstScreenState.Loading ->{

        }

        is FirstScreenState.Results ->{
        LazyColumn{
            items(items =  currentState.items){item ->
                MovieListElement(movie = item)
            }
        }

        }
    }

}

@Composable
fun MovieListElement(movie:MovieDto){
    Column(modifier = Modifier.padding(12.dp)) {
        Text(text =movie.title,
            fontSize = 18.sp)
        )
        Row(horizontalArrangement = Arrangement.Center) {
            Text(text = movie.director)
            Text(text = movie.year.toString())
        }
    }
}