package com.popkova.russianlanguageapp.Lesson6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.R;

public class Lesson_6_grammar_1_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_6_grammar_1_practise);
    }

    public void Check_L6_grammar_1(View view) {
        EditText l6_g1_answer0 = (EditText)findViewById(R.id.l6_g1_answer0);
        EditText l6_g1_answer1 = (EditText)findViewById(R.id.l6_g1_answer1);
        EditText l6_g1_answer2 = (EditText)findViewById(R.id.l6_g1_answer2);
        EditText l6_g1_answer3 = (EditText)findViewById(R.id.l6_g1_answer3);
        EditText l6_g1_answer4 = (EditText)findViewById(R.id.l6_g1_answer4);
        EditText l6_g1_answer5 = (EditText)findViewById(R.id.l6_g1_answer5);
        EditText l6_g1_answer6 = (EditText)findViewById(R.id.l6_g1_answer6);
        EditText l6_g1_answer7 = (EditText)findViewById(R.id.l6_g1_answer7);
        EditText l6_g1_answer8 = (EditText)findViewById(R.id.l6_g1_answer8);
        EditText l6_g1_answer9 = (EditText)findViewById(R.id.l6_g1_answer9);
        EditText l6_g1_answer10 = (EditText)findViewById(R.id.l6_g1_answer10);
        EditText l6_g1_answer11 = (EditText)findViewById(R.id.l6_g1_answer11);
        EditText l6_g1_answer12 = (EditText)findViewById(R.id.l6_g1_answer12);
        EditText l6_g1_answer13 = (EditText)findViewById(R.id.l6_g1_answer13);
        EditText l6_g1_answer14 = (EditText)findViewById(R.id.l6_g1_answer14);


        Intent intent = new Intent(Lesson_6_grammar_1_practise.this, Lesson_6_grammar_1_results.class);

        intent.putExtra("L6G1A0", l6_g1_answer0.getText().toString());
        intent.putExtra("L6G1A1", l6_g1_answer1.getText().toString());
        intent.putExtra("L6G1A2", l6_g1_answer2.getText().toString());
        intent.putExtra("L6G1A3", l6_g1_answer3.getText().toString());
        intent.putExtra("L6G1A4", l6_g1_answer4.getText().toString());
        intent.putExtra("L6G1A5", l6_g1_answer5.getText().toString());
        intent.putExtra("L6G1A6", l6_g1_answer6.getText().toString());
        intent.putExtra("L6G1A7", l6_g1_answer7.getText().toString());
        intent.putExtra("L6G1A8", l6_g1_answer8.getText().toString());
        intent.putExtra("L6G1A9", l6_g1_answer9.getText().toString());
        intent.putExtra("L6G1A10", l6_g1_answer10.getText().toString());
        intent.putExtra("L6G1A11", l6_g1_answer11.getText().toString());
        intent.putExtra("L6G1A12", l6_g1_answer12.getText().toString());
        intent.putExtra("L6G1A13", l6_g1_answer13.getText().toString());
        intent.putExtra("L6G1A14", l6_g1_answer14.getText().toString());



        startActivity(intent);
    }
}
