package com.programmer.a10119227_latihan2;
// Nama : Naufal Hafizh Widiathalla
// Kelas : IF-06
// NIM : 10119227
// Tanggal Pengerjaan : 26 April 2022

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void btnRegister(View view){
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
    }
}