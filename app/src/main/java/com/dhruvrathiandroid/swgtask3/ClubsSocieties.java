package com.dhruvrathiandroid.swgtask3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ClubsSocieties extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs_societies);

        listView=findViewById(R.id.listView);

        List<String> title=new ArrayList<>();
        List<Integer> image=new ArrayList<>();

        title.add("STUDENT WELFARE GROUP: To help the students in improving their skills, attitude and provide resources.");
        title.add("INSTITUTE WELNESS GROUP: Enforce welfare activities among the student community and act as primary nodes of mature student counseling.");
        title.add("KOSS: A group of Coders who are enthusiastic about the Open Source Movement and spreading awareness about coding and FOSS.");
        title.add("ECELL: Provides great opportunities for start-ups,colleges,alumni and corporates to get involved with us");

        image.add(R.drawable.swgicon);
        image.add(R.drawable.iwgicon);
        image.add(R.drawable.koss);
        image.add(R.drawable.ecellicon);

        MyAdapter myAdapter=new MyAdapter(this,title,image);
        listView.setAdapter(myAdapter);
    }
}