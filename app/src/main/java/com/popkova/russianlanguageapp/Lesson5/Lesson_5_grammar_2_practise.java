package com.popkova.russianlanguageapp.Lesson5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.R;

public class Lesson_5_grammar_2_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_5_grammar_2_practise);
    }

    public void Check_L5_grammar_2 (View view) {
        EditText l5_g2_answer0 = (EditText)findViewById(R.id.l5_g2_answer0);
        EditText l5_g2_answer1 = (EditText)findViewById(R.id.l5_g2_answer1);
        EditText l5_g2_answer2 = (EditText)findViewById(R.id.l5_g2_answer2);
        EditText l5_g2_answer3 = (EditText)findViewById(R.id.l5_g2_answer3);
        EditText l5_g2_answer4 = (EditText)findViewById(R.id.l5_g2_answer4);
        EditText l5_g2_answer5 = (EditText)findViewById(R.id.l5_g2_answer5);
        EditText l5_g2_answer6 = (EditText)findViewById(R.id.l5_g2_answer6);
        EditText l5_g2_answer7 = (EditText)findViewById(R.id.l5_g2_answer7);
        EditText l5_g2_answer8 = (EditText)findViewById(R.id.l5_g2_answer8);
        EditText l5_g2_answer9 = (EditText)findViewById(R.id.l5_g2_answer9);
        EditText l5_g2_answer10 = (EditText)findViewById(R.id.l5_g2_answer10);
        EditText l5_g2_answer11 = (EditText)findViewById(R.id.l5_g2_answer11);
        EditText l5_g2_answer12 = (EditText)findViewById(R.id.l5_g2_answer12);
        EditText l5_g2_answer13 = (EditText)findViewById(R.id.l5_g2_answer13);
        EditText l5_g2_answer14 = (EditText)findViewById(R.id.l5_g2_answer14);


        Intent intent = new Intent(Lesson_5_grammar_2_practise.this, Lesson_5_grammar_2_results.class);

        intent.putExtra("L5G2A0", l5_g2_answer0.getText().toString());
        intent.putExtra("L5G2A1", l5_g2_answer1.getText().toString());
        intent.putExtra("L5G2A2", l5_g2_answer2.getText().toString());
        intent.putExtra("L5G2A3", l5_g2_answer3.getText().toString());
        intent.putExtra("L5G2A4", l5_g2_answer4.getText().toString());
        intent.putExtra("L5G2A5", l5_g2_answer5.getText().toString());
        intent.putExtra("L5G2A6", l5_g2_answer6.getText().toString());
        intent.putExtra("L5G2A7", l5_g2_answer7.getText().toString());
        intent.putExtra("L5G2A8", l5_g2_answer8.getText().toString());
        intent.putExtra("L5G2A9", l5_g2_answer9.getText().toString());
        intent.putExtra("L5G2A10", l5_g2_answer10.getText().toString());
        intent.putExtra("L5G2A11", l5_g2_answer11.getText().toString());
        intent.putExtra("L5G2A12", l5_g2_answer12.getText().toString());
        intent.putExtra("L5G2A13", l5_g2_answer13.getText().toString());
        intent.putExtra("L5G2A14", l5_g2_answer14.getText().toString());

        startActivity(intent);

    }
}
 //TODO: разобраться с разметкой xml