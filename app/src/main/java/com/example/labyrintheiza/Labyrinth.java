package com.example.labyrintheiza;

import android.view.ViewGroup;

import android.widget.RelativeLayout;


import java.util.ArrayList;
import java.util.List;

public class Labyrinth {
    MainActivity context;
    private List<Mur> listDeMur = new ArrayList<>();

    public Labyrinth(MainActivity context) {
        this.context = context;
    }

    public void init(final RelativeLayout relativeLayout) {

        Mur mur = new Mur(context, 0, 150,500,100);
        Mur mur2 = new Mur(context, 700, 150,500,100);

        Mur mur3 = new Mur(context, 300, 450,600,100);
        Mur mur4 = new Mur(context, 300, 450,100,400);
        Mur mur5 = new Mur(context, 800, 450,100,400);
        Mur mur6 = new Mur(context, 800, 750,600,100);

        Mur mur7 = new Mur(context, 0, 1050,300,100);
        Mur mur8 = new Mur(context, 500, 1050,350,100);
        Mur mur9 = new Mur(context, 500, 1050,100,400);//|
        Mur mur10 = new Mur(context, 750, 1050,100,400); //|
        Mur mur11 = new Mur(context, 300, 1400,300,100);
        Mur mur12 = new Mur(context, 300, 1500,100,150);
        Mur mur13 = new Mur(context, 300, 1550,300,100);
        Mur mur14 = new Mur(context, 500, 1600,100,150);
        Mur mur15 = new Mur(context, 0, 1750,600,100);
        Mur mur16 = new Mur(context, 750, 1600,100,300);
        Mur mur17 = new Mur(context, 750, 1650,600,100);


        listDeMur.add(mur);
        listDeMur.add(mur2);

        listDeMur.add(mur3);
        listDeMur.add(mur4);
        listDeMur.add(mur5);
        listDeMur.add(mur6);

        listDeMur.add(mur7);
        listDeMur.add(mur8);
        listDeMur.add(mur9);
        listDeMur.add(mur10);
        listDeMur.add(mur11);
        listDeMur.add(mur12);
        listDeMur.add(mur13);
        listDeMur.add(mur14);
        listDeMur.add(mur15);
        listDeMur.add(mur16);
        listDeMur.add(mur17);

        relativeLayout.addView(mur.getImageViewMur());
        relativeLayout.addView(mur2.getImageViewMur());
        relativeLayout.addView(mur3.getImageViewMur());
        relativeLayout.addView(mur4.getImageViewMur());
        relativeLayout.addView(mur5.getImageViewMur());
        relativeLayout.addView(mur6.getImageViewMur());
        relativeLayout.addView(mur7.getImageViewMur());
        relativeLayout.addView(mur8.getImageViewMur());
        relativeLayout.addView(mur9.getImageViewMur());
        relativeLayout.addView(mur10.getImageViewMur());
        relativeLayout.addView(mur11.getImageViewMur());
        relativeLayout.addView(mur12.getImageViewMur());
        relativeLayout.addView(mur13.getImageViewMur());
        relativeLayout.addView(mur14.getImageViewMur());
        relativeLayout.addView(mur15.getImageViewMur());
        relativeLayout.addView(mur16.getImageViewMur());
        relativeLayout.addView(mur17.getImageViewMur());




    }
}
