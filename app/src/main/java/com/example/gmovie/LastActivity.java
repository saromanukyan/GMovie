package com.example.gmovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.gmovie.model.Score;

public class LastActivity extends AppCompatActivity {
    TextView scoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        TextView closeBtn = findViewById(R.id.closeButton);
        TextView replayBtn = findViewById(R.id.replayButton);
        scoreTextView = findViewById(R.id.scoreText);
        scoreTextView.setText("" + Score.currentScore);

        closeBtn.setOnClickListener(v -> goToMainActivity());
        replayBtn.setOnClickListener(v -> goToGameActivity());
    }

    private void goToMainActivity() {
        Intent i = new Intent(this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }

    private void goToGameActivity() {
        Intent i = new Intent(this, ActivityGame.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }
}