package com.dhruvrathiandroid.swgtask3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View v){
        Toast.makeText(this, "Welcome to Study Material", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, StudyMaterial.class);
        startActivity(intent);
    }
    public void openSocieties(View v){
        Toast.makeText(this, "Welcome to Clubs and Societies", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ClubsSocieties.class);
        startActivity(intent);
    }

}