package com.latihan2bloodshare;

/*
 * NIM   : 10118016
 * NAMA  : Rezky Nur Fauzi
 * KELAS : IF1
 * TGL   : 28/04/2021
 * Deskripsi : Membuat action onCLick menuju RegisterActivity
 * */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }


    public void OnClick(View view){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
}