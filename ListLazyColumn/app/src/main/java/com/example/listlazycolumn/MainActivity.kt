package com.example.listlazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.listlazycolumn.ui.theme.ListLazyColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //이 안에만 코드작성 가능
            val scrollState = rememberScrollState() //스크롤동작
            Column(
                Modifier
                    .background(Color.Green)
                    .fillMaxWidth()
                    .verticalScroll(scrollState)//스크롤
            ) {
                for (i in 1..50)
                    Text(text = "글씨 $i")
            }

        }
    }
}
