package com.latihan2bloodshare;

/*
 * NIM   : 10118016
 * NAMA  : Rezky Nur Fauzi
 * KELAS : IF1
 * TGL   : 28/04/2021
 * Deskripsi : Membuat HomeActivity
 * */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
    }

}