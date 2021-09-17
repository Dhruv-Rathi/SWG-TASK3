package com.dhruvrathiandroid.swgtask3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ClubsSocieties extends AppCompatActivity {

    private RecyclerView nSocList;
    private DatabaseReference nDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs_societies);

        nDatabase = FirebaseDatabase.getInstance().getReference().child("societies");
        nDatabase.keepSynced(true);
        nSocList = (RecyclerView)findViewById(R.id.myrecycleview);
        nSocList.setHasFixedSize(true);
        nSocList.setLayoutManager(new LinearLayoutManager(this));



//        listView=findViewById(R.id.listView);
//
//        List<String> title=new ArrayList<>();
//        List<Integer> image=new ArrayList<>();
//
//        title.add("STUDENT WELFARE GROUP: To help the students in improving their skills, attitude and provide resources.");
//        title.add("INSTITUTE WELNESS GROUP: Enforce welfare activities among the student community and act as primary nodes of mature student counseling.");
//        title.add("KOSS: A group of Coders who are enthusiastic about the Open Source Movement and spreading awareness about coding and FOSS.");
//        title.add("ECELL: Provides great opportunities for start-ups,colleges,alumni and corporates to get involved with us");
//
//        image.add(R.drawable.swgicon);
//        image.add(R.drawable.iwgicon);
//        image.add(R.drawable.koss);
//        image.add(R.drawable.ecellicon);

        //MyAdapter myAdapter=new MyAdapter(this,title,image);
        //listView.setAdapter(myAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Society, SocViewHolder>firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<Society, SocViewHolder>
                (Society.class, R.layout.items,SocViewHolder.class, nDatabase) {
            @NonNull
            @Override
            public SocViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return null;
            }

            @Override
            protected void onBindViewHolder(@NonNull SocViewHolder holder, int position, @NonNull Society model) {

            }

            protected void populateViewHolder(SocViewHolder viewHolder, Society model, int position) {
                viewHolder.setSocName(model.getSocName());
                viewHolder.setSocDesc(model.getSocDesc());
            }
        };
        nSocList.setAdapter(firebaseRecyclerAdapter);
    }

    public static class SocViewHolder extends RecyclerView.ViewHolder
    {
        View mView;
        public SocViewHolder(View itemView)
        {
            super(itemView);
            mView=itemView;
        }
        public void setSocName(String socName)
        {
            TextView textView = (TextView)mView.findViewById(R.id.textView);
            textView.setText(socName);
        }
        public void setSocDesc(String socDesc)
        {
            TextView desc = (TextView)mView.findViewById(R.id.desc);
            desc.setText(socDesc);
        }
    }
}