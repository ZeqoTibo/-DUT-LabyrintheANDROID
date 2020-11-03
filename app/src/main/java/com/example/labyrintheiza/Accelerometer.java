package com.example.labyrintheiza;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;


import static com.example.labyrintheiza.Ball.ballParams;
import static com.example.labyrintheiza.MainActivity.heigth;
import static com.example.labyrintheiza.MainActivity.width;
import static android.content.Context.SENSOR_SERVICE;

public class Accelerometer implements SensorEventListener {
    public MainActivity context;
    public SensorManager sensorManager;
    public Sensor accelerometer;


    public Accelerometer(MainActivity pContext){

        context = pContext;
        sensorManager = (SensorManager) context.getSystemService(SENSOR_SERVICE);
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            float newX = -sensorEvent.values[0];
            float newY = sensorEvent.values[1];
            Log.e("accelerometer","New x = "+newX+ " New y = "+newY);

            if (MainActivity.ball.getBallX() < 0 || MainActivity.ball.getBallX() > (width - ballParams.width)) {
                if (MainActivity.ball.getBallX() < 0) {
                    MainActivity.ball.setBallX(1);
                }

                if (MainActivity.ball.getBallX() > (width - ballParams.width)) {
                    MainActivity.ball.setBallX(width - ballParams.width - 1);
                }

            } else {
                MainActivity.ball.setBallX((float) (MainActivity.ball.getBallX() + newX ));
            }

            if (MainActivity.ball.getBallY() < 0 || MainActivity.ball.getBallY() > (heigth - ballParams.height )) {
                if (MainActivity.ball.getBallY() < 0) {
                    MainActivity.ball.setBallY(1);
                }

                if (MainActivity.ball.getBallY() > (heigth - ballParams.height)) {
                    MainActivity.ball.setBallY(heigth - ballParams.height  );
                }

            } else {
                MainActivity.ball.setBallY((float) (MainActivity.ball.getBallY() + newY ));
            }
        }
    }

    public void start() {
        sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_FASTEST);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
