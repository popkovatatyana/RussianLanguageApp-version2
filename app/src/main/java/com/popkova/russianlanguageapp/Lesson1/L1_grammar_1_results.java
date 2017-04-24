package com.popkova.russianlanguageapp.Lesson1;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import com.popkova.russianlanguageapp.R;
import com.popkova.russianlanguageapp.UserLocalStore;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class L1_grammar_1_results extends AppCompatActivity {
    private int scoreForAGame = 0;
    UserLocalStore userLocalData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l1_grammar_results);
        final RatingBar defaultRatingBar = (RatingBar) findViewById(R.id.ratingBar_default);
        TextView mL1_G_RESULTS = (TextView) findViewById(R.id.L1_G_RESULTS);
        Context context = getBaseContext();
        String answersJson = readRawTextFile(context, getResources().getIdentifier("l1_g1_answersjson", "raw", "com.popkova.russianlanguageapp"));
        for (int i = 0; i < 32; i++) {
            String answerReceived = getIntent().getExtras().getString("L1G1A" + Integer.toString(i));
            try {
                JSONObject jsonObject = new JSONObject(answersJson);
                String answerTrue = jsonObject.getString("L1G1A" + Integer.toString(i));
                if (answerTrue.equals(answerReceived.toLowerCase())) {
                    scoreForAGame++;
                }
            } catch (JSONException e) {
            }
        }

        String result = "Правильных ответов: " + scoreForAGame;
        defaultRatingBar.setRating((scoreForAGame/32)*2);
        defaultRatingBar.setStepSize(1);
        LayerDrawable stars = (LayerDrawable) defaultRatingBar.getProgressDrawable();
        stars.getDrawable(scoreForAGame/32*2).setColorFilter(getResources().getColor(R.color.colorAccent), PorterDuff.Mode.SRC_ATOP);
        mL1_G_RESULTS.setText(result);
        userLocalData = new UserLocalStore(this);
        userLocalData.setScoreForAGame(scoreForAGame);
        userLocalData.setTotalScore(scoreForAGame);
        TextView totalScore = (TextView) findViewById(R.id.TOTAL_SCORE);
        totalScore.setText(userLocalData.getTotalScore() + "");
    }

    public static String readRawTextFile(Context context, int resId)
    {
        InputStream inputStream = context.getResources().openRawResource(resId);

        InputStreamReader inputReader = new InputStreamReader(inputStream);
        BufferedReader buffReader = new BufferedReader(inputReader);
        String line;
        StringBuilder builder = new StringBuilder();

        try {
            while (( line = buffReader.readLine()) != null) {
                builder.append(line);
                builder.append("\n");
            }
        } catch (IOException e) {
            return null;
        }
        return builder.toString();
    }
}
