package com.hajhosseinico.lazystaggeredgrid.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage

@Composable
fun GridImageItem(imageUrl: String, aspectRatio: Float, onClick: () -> Unit) {
    AsyncImage(
        model = imageUrl,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(aspectRatio) // Use the stored aspect ratio
            .clickable { onClick() }
    )
}
