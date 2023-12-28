package com.example.box

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.box.ui.theme.BoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {//안에있는 내용들이 겹칠 수 있는 성질을가짐
            Box(
                modifier = Modifier.background(Color.Gray)
                    .fillMaxWidth()
                    .height(200.dp),
                contentAlignment = Alignment.Center,//글씨정렬 속성
            ) {
                Text(text = "Hello")
                Box(//두 글씨를 서로다른 위치에 배치
                    Modifier
                        .fillMaxSize()
                        .padding(16.dp),//패딩 지정
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Text(text = "12345~~~~")
                }
            }
        }
    }
}
