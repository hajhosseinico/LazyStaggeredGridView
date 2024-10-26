package com.hajhosseinico.lazystaggeredgrid.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.ui.Modifier
import com.hajhosseinico.lazystaggeredgrid.presentation.uicore.ImageStaggeredGrid
import com.hajhosseinico.lazystaggeredgrid.ui.theme.LazyStaggeredGridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LazyStaggeredGridTheme {
                val staggeredGridState = rememberLazyStaggeredGridState()

                Column(modifier = Modifier.fillMaxSize()) {
                    ImageStaggeredGrid(
                        imageUrls = imageUrls,
                        staggeredGridState = staggeredGridState
                    )
                }
            }
        }
    }
}

private val imageUrls = listOf(
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1511765224389-37f0e77cf0eb",
    "https://images.unsplash.com/photo-1494438639946-1ebd1d20bf85",
    "https://images.unsplash.com/photo-1519974719765-e6559eac2575",
    "https://images.unsplash.com/photo-1501594907352-04cda38ebc29",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1522202176988-66273c2fd55f",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1523275335684-37898b6baf30",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1511765224389-37f0e77cf0eb",
    "https://images.unsplash.com/photo-1494438639946-1ebd1d20bf85",
    "https://images.unsplash.com/photo-1519974719765-e6559eac2575",
    "https://images.unsplash.com/photo-1501594907352-04cda38ebc29",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1522202176988-66273c2fd55f",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1523275335684-37898b6baf30",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1511765224389-37f0e77cf0eb",
    "https://images.unsplash.com/photo-1494438639946-1ebd1d20bf85",
    "https://images.unsplash.com/photo-1519974719765-e6559eac2575",
    "https://images.unsplash.com/photo-1501594907352-04cda38ebc29",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1522202176988-66273c2fd55f",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1523275335684-37898b6baf30",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1511765224389-37f0e77cf0eb",
    "https://images.unsplash.com/photo-1494438639946-1ebd1d20bf85",
    "https://images.unsplash.com/photo-1519974719765-e6559eac2575",
    "https://images.unsplash.com/photo-1501594907352-04cda38ebc29",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1522202176988-66273c2fd55f",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
    "https://images.unsplash.com/photo-1523275335684-37898b6baf30",
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0",
)
