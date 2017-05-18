package com.popkova.russianlanguageapp.Lesson10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.R;

public class Lesson_10_grammar_1_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_10_grammar_1_practise);
    }

    public void Check_L10_grammar_1(View view) {
        EditText l10_g1_answer0 = (EditText)findViewById(R.id.l10_g1_answer0);
        EditText l10_g1_answer1 = (EditText)findViewById(R.id.l10_g1_answer1);
        EditText l10_g1_answer2 = (EditText)findViewById(R.id.l10_g1_answer2);
        EditText l10_g1_answer3 = (EditText)findViewById(R.id.l10_g1_answer3);
        EditText l10_g1_answer4 = (EditText)findViewById(R.id.l10_g1_answer4);
        EditText l10_g1_answer5 = (EditText)findViewById(R.id.l10_g1_answer5);
        EditText l10_g1_answer6 = (EditText)findViewById(R.id.l10_g1_answer6);
        EditText l10_g1_answer7 = (EditText)findViewById(R.id.l10_g1_answer7);
        EditText l10_g1_answer8 = (EditText)findViewById(R.id.l10_g1_answer8);
        EditText l10_g1_answer9 = (EditText)findViewById(R.id.l10_g1_answer9);

        Intent intent = new Intent(Lesson_10_grammar_1_practise.this, Lesson_10_grammar_1_results.class);

        intent.putExtra("L10G1A0", l10_g1_answer0.getText().toString());
        intent.putExtra("L10G1A1", l10_g1_answer1.getText().toString());
        intent.putExtra("L10G1A2", l10_g1_answer2.getText().toString());
        intent.putExtra("L10G1A3", l10_g1_answer3.getText().toString());
        intent.putExtra("L10G1A4", l10_g1_answer4.getText().toString());
        intent.putExtra("L10G1A5", l10_g1_answer5.getText().toString());
        intent.putExtra("L10G1A6", l10_g1_answer6.getText().toString());
        intent.putExtra("L10G1A7", l10_g1_answer7.getText().toString());
        intent.putExtra("L10G1A8", l10_g1_answer8.getText().toString());
        intent.putExtra("L10G1A9", l10_g1_answer9.getText().toString());

        startActivity(intent);

    }
}
