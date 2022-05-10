package com.ebinumer.sensorwithjetpack

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SensorModule {

    @Provides
    @Singleton
    fun provideLightSensor(app:Application):MeasurableSensor{
        return LightSensor(app)
    }

//    @Provides
//    @Singleton
//    fun provideDistanceSensor(app:Application):MeasurableSensor{
//        return ProximitySensor(app)
//    }
}