package com.example.todaline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnfunct1(View view) {
        Intent intent = new Intent(this,driver_info1.class);
        startActivity(intent);
    }

    public void btnfunct2(View view) {
        Intent intent1 = new Intent(this,driver_info2.class);
        startActivity(intent1);
    }
}