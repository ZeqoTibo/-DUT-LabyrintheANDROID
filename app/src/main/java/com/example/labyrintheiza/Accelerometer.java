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
    private Labyrinth labyrinth;
    public Mur mur;


    public Accelerometer(MainActivity pContext, Labyrinth laby) {
        labyrinth = laby;
        this.context = pContext;
        sensorManager = (SensorManager) context.getSystemService(SENSOR_SERVICE);
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            float newX = -sensorEvent.values[0];
            float newY = sensorEvent.values[1];

            Log.w("Ball", "Ball x " + ball.getBallX());
            Log.w("Ball", "Ball y " + ball.getBallY());
            if (ball.getBallX() < 0 || ball.getBallX() > (width - ballParams.width)) {
                if (ball.getBallX() < 0) {
                    ball.setBallX(1);
                }

                if (ball.getBallX() > (width - ballParams.width)) {
                    ball.setBallX(width - ballParams.width - 1);
                }

            } else {
                ball.setBallX(ball.getBallX() + newX);
            }

            if (ball.getBallY() < 0 || ball.getBallY() > (heigth - ballParams.height)) {
                if (ball.getBallY() < 0) {
                    ball.setBallY(1);
                }

                if (ball.getBallY() > (heigth - ballParams.height)) {
                    ball.setBallY(heigth - ballParams.height);

                }

            } else {
                ball.setBallY(ball.getBallY() + newY);
            }

            for (Mur m : labyrinth.getMurs()) {
                if (collision(m, ball)) {
                    Log.w("Coll", "collision");
                    ball.setBallX(50);
                    ball.setBallY(10);
                   /* if (MainActivity.ball.getBallX() < 0 || MainActivity.ball.getBallX() > (width - ballParams.width)) {
                        if (MainActivity.ball.getBallX() < 0) {
                            MainActivity.ball.setBallX(1);
                        }

                        if (MainActivity.ball.getBallX() > (width - ballParams.width)) {
                            MainActivity.ball.setBallX(width - ballParams.width - 1);
                        }
                    }*/
                }


            }
        }
    }

    private boolean collision(Mur m, Ball ball){
        if(ball.getBallX() >= (m.getX()-ballParams.width) && ball.getBallX() <= (m.getX() + m.getWidth())
                && ball.getBallY() >= (m.getY()-ballParams.height) && ball.getBallY() <= (m.getY() + m.getHeight())){

            if(ball.getBallX() >= (m.getX()-ballParams.width) && ball.getBallX() <= (m.getX()-ballParams.width+m.getWidth()/2)){
                ball.setBallX(ball.getBallX()-1);
                return true;
            }else if(ball.getBallX() >= (m.getX()-ballParams.width-m.getWidth()/2) && ball.getBallX() <= (m.getX() + m.getWidth())){
                ball.setBallX(ball.getBallX()+1);
                return true;
            }

            if(ball.getBallY() >= (m.getY()-ballParams.height) && ball.getBallY() <= (m.getY()-ballParams.height+20)){
                ball.setBallY(ball.getBallY()-1);
                return true;
            }else if(ball.getBallY() >= (m.getY()-ballParams.height+5) && ball.getBallY() <= (m.getY() + m.getHeight())){
                ball.setBallY(ball.getBallY()+1);
                return true;
            }
        }
        return false;
    }
    private boolean finish(){
        if (){

        }
        return false
    }

    public void start() {

        sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_FASTEST);

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}

