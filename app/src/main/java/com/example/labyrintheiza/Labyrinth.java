package com.example.labyrintheiza;

import android.view.ViewGroup;

import android.widget.RelativeLayout;


import java.util.ArrayList;
import java.util.List;
import static com.example.labyrintheiza.MainActivity.heigth;
import static com.example.labyrintheiza.MainActivity.width;


public class Labyrinth {
    MainActivity context;
    public static List<Mur> listDeMur = new ArrayList<>();


    public Labyrinth(MainActivity context) {
        this.context = context;
    }

    public void init(final RelativeLayout relativeLayout) {


            Mur mur = new Mur(context, 0, 100, 500, 50); //_
            Mur mur2 = new Mur(context, 700, 100, 500, 50);//_

            Mur mur3 = new Mur(context, 150, 250, 800, 50);//_
            Mur mur4 = new Mur(context, 150, 250, 50, 300);//|
            Mur mur5 = new Mur(context, 950, 250, 50, 300);//|

            Mur mur6 = new Mur(context, 0, 650, 350, 50);//_
            Mur mur18 = new Mur(context, 350, 400, 50, 300);//|
            Mur mur23 = new Mur(context, 350, 550, 200, 50);//_

            Mur mur19 = new Mur(context, 650, 650, 550, 50);//_
            Mur mur20 = new Mur(context, 750, 400, 50, 300);//|
            Mur mur21 = new Mur(context, 550, 400, 200, 50);//_
            Mur mur22 = new Mur(context, 550, 250, 50, 200);//|

            Mur mur7 = new Mur(context, 300, 800, 450, 50);//_
            Mur mur10 = new Mur(context, 300, 800, 50, 300); //|
            Mur mur13 = new Mur(context, 750, 800, 50, 450);//|
            Mur mur24 = new Mur(context, 750, 1200, 500, 50);//_

            Mur mur8 = new Mur(context, 130, 800, 50, 400);//|
            Mur mur9 = new Mur(context, 130, 850, 100, 30);//_
            Mur mur11 = new Mur(context, 250, 980, 100, 30);//_
            Mur mur12 = new Mur(context, 130, 1200, 350, 50);//_
            Mur mur14 = new Mur(context, 430, 950, 50, 250);//|
            Mur mur15 = new Mur(context, 430, 950, 150, 50);//_
            Mur mur16 = new Mur(context, 580, 950, 50, 450);//|

            Mur mur17 = new Mur(context, 0, 1350, 1015, 50); //_>
            Mur mur25 = new Mur(context, 100, 1500, 1200, 50); //<_
            Mur mur26 = new Mur(context, 0, 1650, 1015, 50); //_>
            Mur mur27 = new Mur(context, 0, 1900, 1300, 50); //_

            Mur mur28 = new Mur(context, 300, 1650, 50, 150); //|
            Mur mur29 = new Mur(context, 600, 1800, 50, 150); //|
            Mur mur30 = new Mur(context, 0, 1350, 600, 50); //|


            listDeMur.add(mur17);

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

            listDeMur.add(mur18);
            listDeMur.add(mur19);
            listDeMur.add(mur20);
            listDeMur.add(mur21);
            listDeMur.add(mur22);
            listDeMur.add(mur23);
            listDeMur.add(mur24);


            listDeMur.add(mur25);
            listDeMur.add(mur26);
            listDeMur.add(mur27);
            listDeMur.add(mur28);
            listDeMur.add(mur29);




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

            relativeLayout.addView(mur18.getImageViewMur());

            relativeLayout.addView(mur19.getImageViewMur());
            relativeLayout.addView(mur20.getImageViewMur());
            relativeLayout.addView(mur21.getImageViewMur());
            relativeLayout.addView(mur22.getImageViewMur());
            relativeLayout.addView(mur23.getImageViewMur());
            relativeLayout.addView(mur24.getImageViewMur());

            relativeLayout.addView(mur17.getImageViewMur());
            relativeLayout.addView(mur25.getImageViewMur());
            relativeLayout.addView(mur26.getImageViewMur());
            relativeLayout.addView(mur27.getImageViewMur());
            relativeLayout.addView(mur28.getImageViewMur());
            relativeLayout.addView(mur29.getImageViewMur());
            relativeLayout.addView(mur30.getImageViewMur());
    }

    public List<Mur> getMurs() {
        return listDeMur;
    }
}
