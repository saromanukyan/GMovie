package com.example.gmovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gmovie.model.DataOfFrames;
import com.example.gmovie.model.Score;
import com.example.gmovie.model.Picture;
import com.example.gmovie.model.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;

public class ActivityGame extends AppCompatActivity {
    ImageView imageQuestion;
    TextView btnA;
    TextView btnB;
    TextView btnC;
    TextView btnD;
    TextView heart_01;
    TextView heart_02;
    TextView heart_03;
    TextView scoreText;
    ArrayList<Picture> listOfPictures = new ArrayList<>(DataOfFrames.PICTURE_ARRAY_LIST);
    ArrayList<String> listOfAnswers;
    Question question = new Question();
    Stack<Picture> stack = pictureStack();
    String rightAnswer;
    int countOfWrongAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        imageQuestion = findViewById(R.id.imageQuestion);
        btnA = findViewById(R.id.buttonAnswerA);
        btnB = findViewById(R.id.buttonAnswerB);
        btnC = findViewById(R.id.buttonAnswerC);
        btnD = findViewById(R.id.buttonAnswerD);
        btnA.setOnClickListener(this::openGameActivity);
        btnB.setOnClickListener(this::openGameActivity);
        btnC.setOnClickListener(this::openGameActivity);
        btnD.setOnClickListener(this::openGameActivity);

        scoreText = findViewById(R.id.scoreTextView);
        heart_01 = findViewById(R.id.heart_01);
        heart_02 = findViewById(R.id.heart_02);
        heart_03 = findViewById(R.id.heart_03);
        Picture firstPicture = stack.pop();
        rightAnswer = firstPicture.getMovieName();
        generateQuestion(firstPicture);
        Score.currentScore = 0;
        scoreText.setText("" + Score.currentScore);
    }

    private Stack<Picture> pictureStack() {
        Collections.shuffle(listOfPictures);
        Stack<Picture> stack = new Stack<>();
        stack.addAll(listOfPictures);
        return stack;
    }

    private void generateQuestion(Picture picture) {

        imageQuestion.setImageResource(picture.getMovieFrameID());
        listOfAnswers = question.getAnswersList(picture, listOfPictures);
        btnA.setText(listOfAnswers.get(0));
        btnB.setText(listOfAnswers.get(1));
        btnC.setText(listOfAnswers.get(2));
        btnD.setText(listOfAnswers.get(3));

    }

    public void openGameActivity(View view) {
        String answer = ((TextView) view).getText().toString();
        Picture picture = stack.pop();

        if (answer.equals(rightAnswer)) {
            Score.currentScore += 25;
            scoreText.setText("" + Score.currentScore);
            view.setBackgroundResource(R.color.green_overlay);
        } else {
            scoreText.setText("" + Score.currentScore);
            countOfWrongAnswers++;
            view.setBackgroundResource(R.color.red_overlay);

            switch (countOfWrongAnswers) {
                case 1:
                    heart_03.setVisibility(View.GONE);
                    break;
                case 2:
                    heart_02.setVisibility(View.GONE);
                    heart_03.setVisibility(View.GONE);
                    break;
                case 3:
                    goToLastActivity();
            }
        }
        disableButtons();

        rightAnswer = picture.getMovieName();
        final Handler handler = new Handler();
        Timer t = new Timer(false);
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(() -> {
                    if (stack.isEmpty()) {
                        goToLastActivity();
                    } else {
                        view.setBackgroundResource(R.color.gray_overlay);
                        generateQuestion(picture);
                        enableButtons();
                    }
                });
            }
        }, 500);

    }


    private void goToLastActivity() {
        Intent i = new Intent(this, LastActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }

    private void disableButtons() {
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
    }

    private void enableButtons() {
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
    }
}