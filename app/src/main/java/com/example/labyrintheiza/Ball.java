package com.example.labyrintheiza;

import android.widget.ImageView;
import android.widget.RelativeLayout;

import static com.example.labyrintheiza.MainActivity.ballParams;


public class Ball {
    private ImageView ball;


    public Ball(MainActivity context) {
        this.ball = new ImageView(context);
        this.ball.setImageResource(R.drawable.ball);
    }

    public ImageView getBall() {
        return ball;
    }

    public void setBallX(float x) {
        this.ball.setX(x);
    }

    public void setBallY(float y) {
        this.ball.setY(y);
    }

    public int getBallX() {
        return (int) ball.getX();
    }

    public int getBallY() {
        return (int) ball.getY();
    }

    public void init(RelativeLayout fenetrePrincipale) {
        fenetrePrincipale.addView(ball,ballParams);
    }
}
