package com.imn.serviceeee;

import android.content.Context;
import android.content.Intent;
import android.icu.number.CompactNotation;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, MyService.class);
        ContextCompat.startForegroundService(this,intent);
    }
}