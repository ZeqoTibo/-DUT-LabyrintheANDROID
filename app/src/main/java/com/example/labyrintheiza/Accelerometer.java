package com.example.labyrintheiza;

import android.app.AlertDialog;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import android.view.View;


import static com.example.labyrintheiza.Ball.ballParams;
import static com.example.labyrintheiza.MainActivity.ball;
import static com.example.labyrintheiza.MainActivity.heigth;
import static com.example.labyrintheiza.MainActivity.width;
import static android.content.Context.SENSOR_SERVICE;

public class Accelerometer implements SensorEventListener {
    public MainActivity context;
    public SensorManager sensorManager;
    public Sensor accelerometer;
    public Mur mur;


    public Accelerometer(MainActivity pContext) {

        this.context = pContext;
        sensorManager = (SensorManager) context.getSystemService(SENSOR_SERVICE);
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        mur = new Mur(context,0,100,500,500);
        if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {

            float newX = -sensorEvent.values[0];
            float newY = sensorEvent.values[1];
            Log.e("accelerometer", "New x = " + ball.getBallX() + " New y = " + ball.getBallY());

            if (ball.getBallX() < 0 || ball.getBallX() > (width - ballParams.width)) {
                if (ball.getBallX() < 0) {
                    ball.setBallX(1);
                }

                if (ball.getBallX() > (width - ballParams.width)) {
                    ball.setBallX(width - ballParams.width - 1);
                }

            } else {
                ball.setBallX((float) (ball.getBallX() + newX));
            }

            if (ball.getBallY() < 0 || ball.getBallY() > (heigth - ballParams.height)) {
                if (ball.getBallY() < 0) {
                    ball.setBallY(1);
                }

                if (ball.getBallY() > (heigth - ballParams.height)) {
                    ball.setBallY(heigth - ballParams.height);

                }

            } else {
                ball.setBallY((float) (ball.getBallY() + newY));
            }

            if (mur.getX()< ball.getBallX()+ball.getWidth() && ball.getBallX()+ball.getWidth()< mur.getWidth() ){
                if(mur.getY() < ball.getBallY()+ball.getHeight() && ball.getBallY()+ball.getHeight()< mur.getHeight()){
                    ball.setBallY(mur.getY());
                }

            }

        }
    }

    public AlertDialog finish(){
        AlertDialog.Builder myPopup = new AlertDialog.Builder(this.context);
        if ( 500 < ball.getBallX()  || ball.getBallX() < 1100) {
            if (ball.getBallY() > 1000 || ball.getBallY() < 1900) {

                myPopup.setTitle("GG");
                myPopup.setMessage("Bien joué tu as gagné !");
                Log.e("Accelerometer","Bien joué");


            }
        }
        return myPopup.create();
    }

    public void start() {

        sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_FASTEST);

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}

