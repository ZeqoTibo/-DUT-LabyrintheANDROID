package com.example.labyrintheiza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InfoActivity extends AppCompatActivity {
private Button buttonLancer;
private EditText editTextPseudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        String prenom = sharedPreferences.getString("prenom", "");

        buttonLancer = findViewById(R.id.buttonLancer);
        editTextPseudo = (EditText) findViewById(R.id.pseudo);

    }

    public void Go(View v){
        String pseudo = editTextPseudo.getText().toString();
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("pseudo", pseudo);
        editor.apply();

        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("pseudo",pseudo);
        startActivity(intent);
    }



}