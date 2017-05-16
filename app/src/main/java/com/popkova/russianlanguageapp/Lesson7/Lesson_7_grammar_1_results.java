package com.popkova.russianlanguageapp.Lesson7;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

public class Lesson_7_grammar_1_results extends AppCompatActivity {
    private int scoreForAGame = 0;
    UserLocalStore userLocalData;
    final int DIALOG_EXIT = 1;
    String errorsInGame = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_3_grammar_2_results);
        TextView mL1_G_RESULTS = (TextView) findViewById(R.id.L1_G_RESULTS);
        Context context = getBaseContext();
        String answersJson = readRawTextFile(context, getResources().getIdentifier("l7_g1_answersjson", "raw", "com.popkova.russianlanguageapp"));
        for (int i = 0; i < 10; i++) {
            String answerReceived = getIntent().getExtras().getString("L7G1A" + Integer.toString(i));
            try {
                JSONObject jsonObject = new JSONObject(answersJson);
                String answerTrue = jsonObject.getString("L7G1A" + Integer.toString(i));
                String totalString = jsonObject.getString("L7G1A" + Integer.toString(i)+"total");
                if (answerTrue.equals(answerReceived.toLowerCase())) {
                    scoreForAGame++;
                }else{
                    errorsInGame +=answerReceived.toLowerCase() + ", correct answer: "+ totalString;
                }
            } catch (JSONException e) {
            }
        }

        String result = scoreForAGame + "/10";
        float d= (float) ((scoreForAGame*5)/10);
        RatingBar rb = (RatingBar) findViewById(R.id.ratingBar1);
        rb.setRating(d);
        mL1_G_RESULTS.setText(result);
        userLocalData = new UserLocalStore(this);
        userLocalData.setScoreForAGame(scoreForAGame);
        userLocalData.setTotalScore(scoreForAGame);
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

    public void onclick(View v) {
        // вызываем диалог
        showDialog(DIALOG_EXIT);
    }

    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_EXIT) {
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            // заголовок
            adb.setTitle("Mistakes");
            // сообщение
            adb.setMessage(errorsInGame);
            adb.setPositiveButton(R.string.ok, myClickListener);
            return adb.create();
        }
        return super.onCreateDialog(id);
    }
    DialogInterface.OnClickListener myClickListener = new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int which) {
            switch (which) {
                // положительная кнопка
                case Dialog.BUTTON_POSITIVE:
                    finish();
                    break;
            }
        }
    };


}
