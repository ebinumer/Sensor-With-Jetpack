package com.ebinumer.sensorwithjetpack

import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Sensor

class LightSensor(
    context: Context
):AndroidSenor(
    context = context,
    sensorFeature = PackageManager.FEATURE_SENSOR_LIGHT,
    senorType = Sensor.TYPE_LIGHT

)

//this sensor measure the distance between objects eg:screen off when Calling
class ProximitySensor(
    context: Context
):AndroidSenor(
    context = context,
    sensorFeature = PackageManager.FEATURE_SENSOR_PROXIMITY,
    senorType = Sensor.TYPE_PROXIMITY

)