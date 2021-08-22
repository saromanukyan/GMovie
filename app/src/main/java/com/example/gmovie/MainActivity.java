package com.example.gmovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView callBtn = findViewById(R.id.btnStart);
        callBtn.setOnClickListener(this::openGameActivity);
    }

    private void openGameActivity(View view) {
        Intent intent = new Intent(this, ActivityGame.class);
        startActivity(intent);
    }
}