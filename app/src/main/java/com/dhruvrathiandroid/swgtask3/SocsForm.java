package com.dhruvrathiandroid.swgtask3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SocsForm extends AppCompatActivity {

    private EditText edit;
    private Button add;
    private EditText edit2;

    DatabaseReference databaseSocieties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socs_form);

        databaseSocieties = FirebaseDatabase.getInstance().getReference("societies");

        edit = findViewById(R.id.edit1);
        add = findViewById(R.id.add);
        edit2 = findViewById(R.id.edit2);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                addSoc();
            }
        });

    }
    private void addSoc(){
        String name = edit.getText().toString().trim();
        String desc = edit2.getText().toString().trim();
        if(!TextUtils.isEmpty(name)){
            String id = databaseSocieties.push().getKey();
            Society society = new Society(id, name, desc);
            databaseSocieties.child(id).setValue(society);
            Toast.makeText(this,"Society Added", Toast.LENGTH_LONG).show();

        }
        else{
            Toast.makeText(this,"You should Enter a name", Toast.LENGTH_LONG).show();
        }
    }
}