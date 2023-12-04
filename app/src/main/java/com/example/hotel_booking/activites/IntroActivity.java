package com.example.hotel_booking.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hotel_booking.R;

public class IntroActivity extends AppCompatActivity {
private Button startBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        initView();
    }

    private void initView(){
        startBtn = findViewById(R.id.startBtn);
        startBtn.setOnClickListener(view -> startActivity(new Intent(IntroActivity.this,MainActivity.class)));
    }
}