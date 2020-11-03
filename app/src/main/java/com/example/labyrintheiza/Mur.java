package com.example.labyrintheiza;


import android.widget.ImageView;

public class Mur {
    private MainActivity context;
    private ImageView imageViewMur;
    private int height;
    private int width;


    public Mur(MainActivity context, int x, int y, int height, int width) {
        this.context = context;
        this.height = height;
        this.width = width;
        imageViewMur = new ImageView(context);
        imageViewMur.setX(x);
        imageViewMur.setY(y);
    }

    public void setX(int x) {
        this.imageViewMur.setX(x);
    }

    public void setY(int y) {

        this.imageViewMur.setY(y);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return (int) imageViewMur.getX();
    }

    public int getY() {
        return (int) imageViewMur.getY();
    }

    public ImageView getImageViewMur(){
        return imageViewMur;
    }
}
