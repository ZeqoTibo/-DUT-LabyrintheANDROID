package com.example.labyrintheiza;

import android.view.ViewGroup;
import android.widget.ImageView;

public class Finish {
    private MainActivity context;
    private ImageView imageViewMur;
    private ViewGroup.LayoutParams paramMur = new ViewGroup.LayoutParams(500, 100);
    private int x;
    private int y;
    private int width;
    private int height;

    public Finish(MainActivity context, int x, int y, int width, int height) {
        this.context = context;
        imageViewMur = new ImageView(context);
        imageViewMur.setLayoutParams(paramMur);
        paramMur.height = height;
        this.x = x;
        this.y =y;
        this.width = width;
        this.height = height;
        paramMur.width = width;
        imageViewMur.setX(x);
        imageViewMur.setY(y);
        imageViewMur.setBackgroundResource(R.drawable.);

    }
}
