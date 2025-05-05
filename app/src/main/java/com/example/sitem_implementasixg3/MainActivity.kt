package com.namamu.app.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.namamu.app.R

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            // Logo splash
            Image(
                painter = painterResource(id = R.drawable.ic_splash_logo), // Gantilah dengan nama file logo kamu
                contentDescription = "Splash Logo",
                modifier = Modifier.size(200.dp) // Sesuaikan ukuran logo sesuai kebutuhan
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Nama aplikasi
            Text(
                text = "SYNIS",
                style = MaterialTheme.typography.h4.copy(fontSize = 32.sp)
            )
        }
    }
}
