package com.dhruvrathiandroid.swgtask3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel =
                    new NotificationChannel("SWG-TASK4","SWG-TASK4", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

        FirebaseMessaging.getInstance().subscribeToTopic("general")
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        String msg = "Successfull";
                        if (!task.isSuccessful()) {
                            msg = "Failed";
                        }
                        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });
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
    public void openSocForm(View v) {
        Intent intent = new Intent(this, SocsForm.class);
        startActivity(intent);
    }

}