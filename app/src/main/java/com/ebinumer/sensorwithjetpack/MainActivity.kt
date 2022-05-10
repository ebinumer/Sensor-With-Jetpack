package com.ebinumer.sensorwithjetpack

import android.annotation.SuppressLint
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Bundle
import android.os.PowerManager
import android.os.PowerManager.WakeLock
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ebinumer.sensorwithjetpack.ui.theme.SensorWithJetPackTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @SuppressLint("InvalidWakeLockTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SensorWithJetPackTheme {
                val viewModel = viewModel<MainViewModel>()


                val isDark = viewModel.isDark
                val isNear = viewModel.isNear

               Box(
                   modifier = Modifier
                       .fillMaxSize()
                       .background(
                           if (isDark) Color.DarkGray else Color.White
                       ),
                   contentAlignment = Alignment.Center
               ){

                   Text(color = if(isDark) Color.White else Color.Black,
                   text = if(isDark) {"it's Dark Outside"}
                   else{
                      "It's Light Outside"
                   }
                       )

//                   Text(color = if(isDark) Color.White else Color.Black,
//                       text = if(isNear) {"it's Near"}
//                       else{
//                           "It's Far"
//                       }
//
//                   )
               }
            }
        }
    }
}

