package com.example.gmovie.model;

import java.util.ArrayList;
import java.util.Collections;

public class Question {

    public ArrayList<String> getAnswersList(Picture picture, ArrayList<Picture> pictures_list) {
        ArrayList<String> answers = new ArrayList<>(4);
        String rightAnswer = picture.getMovieName();
        answers.add(rightAnswer);
        int wrongAnswersCount = 0;
        for (Picture p : pictures_list) {
            if (!p.equals(picture)) {
                answers.add(p.getMovieName());
                wrongAnswersCount++;
                if (wrongAnswersCount == 3) break;
            }
        }
        Collections.shuffle(pictures_list);
        Collections.shuffle(answers);
        return answers;

    }
}
