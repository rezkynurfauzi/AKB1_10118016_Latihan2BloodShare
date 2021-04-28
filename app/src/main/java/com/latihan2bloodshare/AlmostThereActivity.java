package com.latihan2bloodshare;

/*
 * NIM   : 10118016
 * NAMA  : Rezky Nur Fauzi
 * KELAS : IF1
 * TGL   : 28/04/2021
 * Deskripsi : Membuat action onCLick menuju VerifyActivity
 * */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlmostThereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        getSupportActionBar().hide();
    }

    public void OnClickVerif(View view){
        Intent intent = new Intent(this,VerifyActivity.class);
        startActivity(intent);
    }
}