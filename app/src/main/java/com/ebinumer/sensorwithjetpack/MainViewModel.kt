package com.ebinumer.sensorwithjetpack

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val  lightSensor: MeasurableSensor,
    private val proximitySensor: MeasurableSensor
):ViewModel() {
    var isDark by mutableStateOf(false)
    var isNear by mutableStateOf(false)
    init {

        lightSensor.startListening()
        lightSensor.setOnSensorValueChangedListener { values ->
            val lux = values[0]
            isDark = lux < 60f
        }
//        proximitySensor.startListening()
//        proximitySensor.setOnSensorValueChangedListener { values ->
//            isNear = values[0] == 0f


//        }
    }
}