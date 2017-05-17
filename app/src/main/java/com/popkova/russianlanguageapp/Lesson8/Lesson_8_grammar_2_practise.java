package com.popkova.russianlanguageapp.Lesson8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.R;

public class Lesson_8_grammar_2_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_8_grammar_2_practise);
    }

    public void Check_L8_grammar_2 (View view) {
        EditText l8_g2_answer0 = (EditText)findViewById(R.id.l8_g2_answer0);
        EditText l8_g2_answer1 = (EditText)findViewById(R.id.l8_g2_answer1);
        EditText l8_g2_answer2 = (EditText)findViewById(R.id.l8_g2_answer2);
        EditText l8_g2_answer3 = (EditText)findViewById(R.id.l8_g2_answer3);
        EditText l8_g2_answer4 = (EditText)findViewById(R.id.l8_g2_answer4);
        EditText l8_g2_answer5 = (EditText)findViewById(R.id.l8_g2_answer5);
        EditText l8_g2_answer6 = (EditText)findViewById(R.id.l8_g2_answer6);
        EditText l8_g2_answer7 = (EditText)findViewById(R.id.l8_g2_answer7);
        EditText l8_g2_answer8 = (EditText)findViewById(R.id.l8_g2_answer8);
        EditText l8_g2_answer9 = (EditText)findViewById(R.id.l8_g2_answer9);

        Intent intent = new Intent(Lesson_8_grammar_2_practise.this, Lesson_8_grammar_2_results.class);

        intent.putExtra("L8G2A0", l8_g2_answer0.getText().toString());
        intent.putExtra("L8G2A1", l8_g2_answer1.getText().toString());
        intent.putExtra("L8G2A2", l8_g2_answer2.getText().toString());
        intent.putExtra("L8G2A3", l8_g2_answer3.getText().toString());
        intent.putExtra("L8G2A4", l8_g2_answer4.getText().toString());
        intent.putExtra("L8G2A5", l8_g2_answer5.getText().toString());
        intent.putExtra("L8G2A6", l8_g2_answer6.getText().toString());
        intent.putExtra("L8G2A7", l8_g2_answer7.getText().toString());
        intent.putExtra("L8G2A8", l8_g2_answer8.getText().toString());
        intent.putExtra("L8G2A9", l8_g2_answer9.getText().toString());

        startActivity(intent);

    }
}
 //TODO: разобраться с разметкой xml