package com.dhruvrathiandroid.swgtask3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.dhruvrathiandroid.swgtask3.ui.main.SectionsPagerAdapter;
import com.dhruvrathiandroid.swgtask3.databinding.ActivityStudyMaterialBinding;

public class StudyMaterial extends AppCompatActivity {

    private ActivityStudyMaterialBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityStudyMaterialBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        //FloatingActionButton fab = binding.fab;

        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
    public void onPhysics(View view)
    {
        Uri uri = Uri.parse("https://drive.google.com/drive/u/0/folders/1Ilkqo4ACbSZcm7sjhIU4Mzo2aDCKWA0A"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void onChemistry(View view)
    {
        Uri uri = Uri.parse("https://drive.google.com/drive/u/0/folders/1LKCznjBAg1Kt1k49n7GDHJy31R0SIAPq"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void onMaths1(View view)
    {
        Uri uri = Uri.parse("https://drive.google.com/drive/u/0/folders/1-ba39v86vbamXlXq-ROn9cSkGNIAttHA"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void onEDCG(View view)
    {
        Uri uri = Uri.parse("https://drive.google.com/drive/u/0/folders/1_zg0V0-atJCDd1p6GUA5lkLUZHctAhG-"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void onEnglish(View view)
    {
        Uri uri = Uri.parse("https://drive.google.com/drive/u/0/folders/1G-fcHUD8CXWjw5nBBchABKVIR3MYxK1c"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void onPDS(View view)
    {
        Uri uri = Uri.parse("https://drive.google.com/drive/u/0/folders/1pn-AFOBpcb0sHw6_zaqNKlXQepEVGVpy"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void onBio(View view)
    {
        Uri uri = Uri.parse("https://drive.google.com/drive/u/0/folders/1-_dcVwdSOQlb6FCJutPET8njbQLlMHpq"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void onMaths2(View view)
    {
        Uri uri = Uri.parse("https://drive.google.com/drive/u/0/folders/17-qeV4Umwvhu8mU0lxXHymLjZxnQb9CZ"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void onET(View view)
    {
        Uri uri = Uri.parse("https://drive.google.com/drive/u/0/folders/1Igrrq58ilumLDdHZrmEHzqW5o_YVisfg"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void onBEM(View view)
    {
        Uri uri = Uri.parse("https://drive.google.com/drive/u/0/folders/1xJn5vlX6mZ5Z-6q7u_huQ74YR4Z9xKk5"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void onEVS(View view)
    {
        Uri uri = Uri.parse("https://drive.google.com/drive/u/0/folders/1-_dcVwdSOQlb6FCJutPET8njbQLlMHpq"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}