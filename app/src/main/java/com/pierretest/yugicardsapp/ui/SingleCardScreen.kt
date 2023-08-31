package com.pierretest.yugicardsapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import com.pierretest.yugicardsapp.data.model.DataModel

@Composable
fun SingleCardScreen(
    singleCardId:Int=0,
    viewModel: CardViewModel = hiltViewModel()
) {

//    LaunchedEffect(Unit) {
//        viewModel.getRandomCard()
//    }

    val hasFetchedCard = remember { mutableStateOf(false) }

    if (!hasFetchedCard.value) {
        viewModel.getRandomCard()
        hasFetchedCard.value = true
    }

    val card by viewModel.singleCard.collectAsState()


    if (card==null) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            CircularProgressIndicator(
                modifier = Modifier
//                    .background(Color.Red)
                    .align(Alignment.Center),
                color = Color.Red
            )
        }

//        Text(text = "No existing Card")
    } else {
        CardInfo(cardModel = card!!)
    }


}

@Composable
fun CardInfo(cardModel : DataModel) {
    Text(text = cardModel.name.toString())
}