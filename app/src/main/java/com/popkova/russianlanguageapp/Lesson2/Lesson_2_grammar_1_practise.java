package com.popkova.russianlanguageapp.Lesson2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.Lesson1.Lesson_1_grammar_1_results;
import com.popkova.russianlanguageapp.R;

public class Lesson_2_grammar_1_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_2_grammar_1_practise);

    }

    public void Check_L2_grammar_1(View view) {

        EditText l2_g1_answer0 = (EditText)findViewById(R.id.l2_g1_answer0);
        EditText l2_g1_answer1 = (EditText)findViewById(R.id.l2_g1_answer1);
        EditText l2_g1_answer2 = (EditText)findViewById(R.id.l2_g1_answer2);
        EditText l2_g1_answer3 = (EditText)findViewById(R.id.l2_g1_answer3);
        EditText l2_g1_answer4 = (EditText)findViewById(R.id.l2_g1_answer4);
        EditText l2_g1_answer5 = (EditText)findViewById(R.id.l2_g1_answer5);
        EditText l2_g1_answer6 = (EditText)findViewById(R.id.l2_g1_answer6);
        EditText l2_g1_answer7 = (EditText)findViewById(R.id.l2_g1_answer7);
        EditText l2_g1_answer8 = (EditText)findViewById(R.id.l2_g1_answer8);
        EditText l2_g1_answer9 = (EditText)findViewById(R.id.l2_g1_answer9);

        Intent intent = new Intent(Lesson_2_grammar_1_practise.this, Lesson_2_grammar_1_results.class);

        intent.putExtra("L2G1A0", l2_g1_answer0.getText().toString());
        intent.putExtra("L2G1A1", l2_g1_answer1.getText().toString());
        intent.putExtra("L2G1A2", l2_g1_answer2.getText().toString());
        intent.putExtra("L2G1A3", l2_g1_answer3.getText().toString());
        intent.putExtra("L2G1A4", l2_g1_answer4.getText().toString());
        intent.putExtra("L2G1A5", l2_g1_answer5.getText().toString());
        intent.putExtra("L2G1A6", l2_g1_answer6.getText().toString());
        intent.putExtra("L2G1A7", l2_g1_answer7.getText().toString());
        intent.putExtra("L2G1A8", l2_g1_answer8.getText().toString());
        intent.putExtra("L2G1A9", l2_g1_answer9.getText().toString());

        startActivity(intent);
    }
}
