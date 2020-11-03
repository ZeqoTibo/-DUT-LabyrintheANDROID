package com.example.labyrintheiza;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;



public class MainActivity extends AppCompatActivity {

    public static Ball ball;
    private RelativeLayout fenetrePrincipale;
    private Accelerometer accelerometer;
    private Labyrinth labyrinth;
    public static int width;
    public static int heigth;
    public static ViewGroup.LayoutParams ballParams = new ViewGroup.LayoutParams(100, 100);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        width = getResources().getDisplayMetrics().widthPixels;
        heigth = getResources().getDisplayMetrics().heightPixels;

        fenetrePrincipale = findViewById(R.id.fenetrePrincipale);
        ball = new Ball(this);
        ball.setBallX(100);
        ball.setBallY(100);
        ball.init(fenetrePrincipale);


        labyrinth = new Labyrinth(this);
        labyrinth.init(2,fenetrePrincipale);

        accelerometer = new Accelerometer(this);
        accelerometer.start();

    }




}