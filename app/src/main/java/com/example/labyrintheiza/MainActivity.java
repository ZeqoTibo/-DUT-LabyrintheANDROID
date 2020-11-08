package com.example.labyrintheiza;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

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

        ball = new Ball(this,50,50,100,100);
        labyrinth = new Labyrinth(this);
        accelerometer = new Accelerometer(this);

        Intent intent = getIntent();
        if(intent !=null){
            String str = "";
            if (intent.hasExtra("pseudo")){
                str = intent.getStringExtra("pseudo");
            }

            final AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Amuse toi bien "+str+".\nBonne chance pour trouver la sortie !");
            builder.setCancelable(true);
            builder.setPositiveButton("Merci :)", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                    accelerometer.start();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

        ball.init(fenetrePrincipale);
        labyrinth.init(fenetrePrincipale);


    }

}