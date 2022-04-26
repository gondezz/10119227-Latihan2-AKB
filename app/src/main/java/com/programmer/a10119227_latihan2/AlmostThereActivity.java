package com.programmer.a10119227_latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AlmostThereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        Button veri = (Button) findViewById(R.id.veri);
        veri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AlmostThereActivity.this, com.programmer.a10119227_latihan2.VerifyActivity.class);
                startActivity(intent);
            }
        });
    }
}