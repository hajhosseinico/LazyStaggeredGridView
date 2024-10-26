package com.hajhosseinico.lazystaggeredgrid.presentation.uicore

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hajhosseinico.lazystaggeredgrid.presentation.GridImageItem
import kotlin.random.Random

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageStaggeredGrid(
    imageUrls: List<String>,
    staggeredGridState: LazyStaggeredGridState
) {
    var selectedImageUrl by remember { mutableStateOf<String?>(null) }
    val aspectRatioMap = remember { mutableMapOf<String, Float>() }

    var isScrollingUp by remember { mutableStateOf(false) }
    var lastScrollOffset by remember { mutableIntStateOf(0) }

    LaunchedEffect(staggeredGridState) {
        snapshotFlow { staggeredGridState.firstVisibleItemScrollOffset }
            .collect { currentOffset ->
                isScrollingUp = currentOffset < lastScrollOffset
                lastScrollOffset = currentOffset
            }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        LazyVerticalStaggeredGrid(
            state = staggeredGridState,
            columns = StaggeredGridCells.Adaptive(150.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }

            items(imageUrls.size) { index ->
                val imageUrl = imageUrls[index]
                val aspectRatio = aspectRatioMap.getOrPut(imageUrl) {
                    Random.nextDouble(0.5, 1.5).toFloat()
                }

                GridImageItem(
                    imageUrl = imageUrl,
                    aspectRatio = aspectRatio,
                    onClick = { selectedImageUrl = imageUrl }
                )
            }
        }

        selectedImageUrl?.let { url ->
            FullScreenImage(imageUrl = url, onDismiss = { selectedImageUrl = null })
        }
    }
}
