package com.example.labyrintheiza;


import android.view.ViewGroup;
import android.widget.ImageView;

public class Mur {
    private MainActivity context;
    private ImageView imageViewMur;
    private ViewGroup.LayoutParams paramMur = new ViewGroup.LayoutParams(500, 100);
    private int x;
    private int y;
    private int width;
    private int height;



    public Mur(MainActivity context, int x, int y, int width, int height) {
        this.context = context;

        imageViewMur = new ImageView(context);
        imageViewMur.setLayoutParams(paramMur);
        paramMur.height = height;
        this.x = x;
        this.y =y;
        paramMur.width = width;
        imageViewMur.setX(x);
        imageViewMur.setY(y);
        imageViewMur.setBackgroundResource(R.drawable.rectanglehorizontale);
        this.width = width;
        this.height = height;
    }

    public void setX(int x) {
        this.imageViewMur.setX(x);
    }

    public void setY(int y) {

        this.imageViewMur.setY(y);
    }

    public int getX() {
        return (int) imageViewMur.getX();
    }

    public int getY() {
        return (int) imageViewMur.getY();
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

    public ImageView getImageViewMur(){
        return imageViewMur;
    }
}
