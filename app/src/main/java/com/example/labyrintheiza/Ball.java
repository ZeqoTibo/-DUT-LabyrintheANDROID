package com.example.labyrintheiza;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class Ball {
    private ImageView ball;
    public static ViewGroup.LayoutParams ballParams = new ViewGroup.LayoutParams(100, 100);
    private int x;
    private int y;
    private int width;
    private int height;

    public Ball(MainActivity context,int x, int y, int width, int height) {
        ball = new ImageView(context);
        ball.setImageResource(R.drawable.ball);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        ballParams.height = height;
        ballParams.width = width;
        this.ball.setX(x);
        this.ball.setY(y);
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void init(RelativeLayout fenetrePrincipale) {
        fenetrePrincipale.addView(ball,ballParams);
    }
    
}
