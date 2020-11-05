package com.example.labyrintheiza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    public static Ball ball;
    private RelativeLayout fenetrePrincipale;
    private Accelerometer accelerometer;
    private Labyrinth labyrinth;
    public static int width;
    public static int heigth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        width = getResources().getDisplayMetrics().widthPixels;
        heigth = getResources().getDisplayMetrics().heightPixels;

        fenetrePrincipale = findViewById(R.id.fenetrePrincipale);
        ball = new Ball(this,50,50,200,200);
        labyrinth = new Labyrinth(this);
        accelerometer = new Accelerometer(this);

        ball.init(fenetrePrincipale);
        labyrinth.init(fenetrePrincipale);
        accelerometer.start();

    }

}