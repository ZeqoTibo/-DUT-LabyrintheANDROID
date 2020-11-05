package com.example.labyrintheiza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {
private Button buttonLancer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        buttonLancer = findViewById(R.id.buttonLancer);

    }

    public void Go(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }



}