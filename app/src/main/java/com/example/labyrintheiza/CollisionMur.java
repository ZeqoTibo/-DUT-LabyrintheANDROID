package com.example.labyrintheiza;

import android.app.AlertDialog;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;


import static com.example.labyrintheiza.Ball.ballParams;
import static com.example.labyrintheiza.MainActivity.ball;
import static com.example.labyrintheiza.MainActivity.heigth;
import static com.example.labyrintheiza.MainActivity.width;
import static android.content.Context.SENSOR_SERVICE;

public class CollisionMur implements SensorEventListener {
    public MainActivity context;
    public SensorManager sensorManager;
    public Sensor accelerometer;
    public Mur mur;


    public CollisionMur(MainActivity pContext) {

        this.context = pContext;
        sensorManager = (SensorManager) context.getSystemService(SENSOR_SERVICE);
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);


    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            float newX = -sensorEvent.values[0];
            float newY = sensorEvent.values[1];
            Log.e("accelerometer", "New x = " + ball.getBallX() + " New y = " + ball.getBallY());

            if (mur.getX()< ball.getBallX()+ball.getWidth() && ball.getBallX()+ball.getWidth()< mur.getWidth() ){
                if(mur.getY() < ball.getBallY()+ball.getHeight() && ball.getBallY()+ball.getHeight()< mur.getHeight()){
                    ball.setBallX(mur.getX());
                    ball.setBallY(mur.getY());
                }

            }

        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}

