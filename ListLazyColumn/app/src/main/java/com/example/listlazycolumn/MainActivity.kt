package com.example.listlazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listlazycolumn.ui.theme.ListLazyColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //rememberScrollState() 를 사용하지 않아도 스크롤이됨

            LazyColumn(
                Modifier
                    .background(Color.Green)
                    .fillMaxWidth(),
                contentPadding = PaddingValues(16.dp),//전체패딩
                verticalArrangement = Arrangement.spacedBy(8.dp),//item간 간격
            ) {
                items(50) { index ->
                    Text (text = "글씨 $index")
                }
            }

        }
    }
}
