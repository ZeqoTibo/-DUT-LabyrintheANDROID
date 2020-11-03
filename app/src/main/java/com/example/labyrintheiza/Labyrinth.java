package com.example.labyrintheiza;

import android.view.ViewGroup;

import android.widget.RelativeLayout;


import java.util.ArrayList;
import java.util.List;

public class Labyrinth {
    MainActivity context;
    private ViewGroup.LayoutParams paramMur = new ViewGroup.LayoutParams(800, 100);
    private List<Mur> listDeMur = new ArrayList<>();

    public Labyrinth(MainActivity context) {
        this.context = context;
    }

    public void init(int nbMur, final RelativeLayout relativeLayout) {

        for (int i = 0; i < nbMur; i++) {

            Mur mur = new Mur(context,5,5,70,80);
            mur.getImageViewMur().setBackgroundResource(R.drawable.rectanglehorizontale);
            mur.getImageViewMur().setX(0);
            mur.getImageViewMur().setY(300);


            listDeMur.add(mur);
            relativeLayout.addView(mur.getImageViewMur(),paramMur);

        }
    }
}
