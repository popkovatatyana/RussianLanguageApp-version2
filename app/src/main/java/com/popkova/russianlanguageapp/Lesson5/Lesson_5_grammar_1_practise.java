package com.popkova.russianlanguageapp.Lesson5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.R;

public class Lesson_5_grammar_1_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_5_grammar_1_practise);
    }

    public void Check_L5_grammar_1(View view) {
        EditText l5_g1_answer0 = (EditText)findViewById(R.id.l5_g1_answer0);
        EditText l5_g1_answer1 = (EditText)findViewById(R.id.l5_g1_answer1);
        EditText l5_g1_answer2 = (EditText)findViewById(R.id.l5_g1_answer2);
        EditText l5_g1_answer3 = (EditText)findViewById(R.id.l5_g1_answer3);
        EditText l5_g1_answer4 = (EditText)findViewById(R.id.l5_g1_answer4);
        EditText l5_g1_answer5 = (EditText)findViewById(R.id.l5_g1_answer5);
        EditText l5_g1_answer6 = (EditText)findViewById(R.id.l5_g1_answer6);
        EditText l5_g1_answer7 = (EditText)findViewById(R.id.l5_g1_answer7);
        EditText l5_g1_answer8 = (EditText)findViewById(R.id.l5_g1_answer8);
        EditText l5_g1_answer9 = (EditText)findViewById(R.id.l5_g1_answer9);
        EditText l5_g1_answer10 = (EditText)findViewById(R.id.l5_g1_answer10);
        EditText l5_g1_answer11 = (EditText)findViewById(R.id.l5_g1_answer11);
        EditText l5_g1_answer12 = (EditText)findViewById(R.id.l5_g1_answer12);
        EditText l5_g1_answer13 = (EditText)findViewById(R.id.l5_g1_answer13);
        EditText l5_g1_answer14 = (EditText)findViewById(R.id.l5_g1_answer14);

        Intent intent = new Intent(Lesson_5_grammar_1_practise.this, Lesson_5_grammar_1_results.class);

        intent.putExtra("L5G1A0", l5_g1_answer0.getText().toString());
        intent.putExtra("L5G1A1", l5_g1_answer1.getText().toString());
        intent.putExtra("L5G1A2", l5_g1_answer2.getText().toString());
        intent.putExtra("L5G1A3", l5_g1_answer3.getText().toString());
        intent.putExtra("L5G1A4", l5_g1_answer4.getText().toString());
        intent.putExtra("L5G1A5", l5_g1_answer5.getText().toString());
        intent.putExtra("L5G1A6", l5_g1_answer6.getText().toString());
        intent.putExtra("L5G1A7", l5_g1_answer7.getText().toString());
        intent.putExtra("L5G1A8", l5_g1_answer8.getText().toString());
        intent.putExtra("L5G1A9", l5_g1_answer9.getText().toString());
        intent.putExtra("L5G1A10", l5_g1_answer10.getText().toString());
        intent.putExtra("L5G1A11", l5_g1_answer11.getText().toString());
        intent.putExtra("L5G1A12", l5_g1_answer12.getText().toString());
        intent.putExtra("L5G1A13", l5_g1_answer13.getText().toString());
        intent.putExtra("L5G1A14", l5_g1_answer14.getText().toString());



        startActivity(intent);



    }
}
