package com.popkova.russianlanguageapp.Lesson4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.R;

public class Lesson_4_grammar_1_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_4_grammar_1_practise);
    }

    public void Check_L4_grammar_1(View view) {
        EditText l4_g1_answer0 = (EditText)findViewById(R.id.l4_g1_answer0);
        EditText l4_g1_answer1 = (EditText)findViewById(R.id.l4_g1_answer1);
        EditText l4_g1_answer2 = (EditText)findViewById(R.id.l4_g1_answer2);
        EditText l4_g1_answer3 = (EditText)findViewById(R.id.l4_g1_answer3);
        EditText l4_g1_answer4 = (EditText)findViewById(R.id.l4_g1_answer4);
        EditText l4_g1_answer5 = (EditText)findViewById(R.id.l4_g1_answer5);
        EditText l4_g1_answer6 = (EditText)findViewById(R.id.l4_g1_answer6);
        EditText l4_g1_answer7 = (EditText)findViewById(R.id.l4_g1_answer7);
        EditText l4_g1_answer8 = (EditText)findViewById(R.id.l4_g1_answer8);
        EditText l4_g1_answer9 = (EditText)findViewById(R.id.l4_g1_answer9);
        EditText l4_g1_answer10 = (EditText)findViewById(R.id.l4_g1_answer10);
        EditText l4_g1_answer11 = (EditText)findViewById(R.id.l4_g1_answer11);


        Intent intent = new Intent(Lesson_4_grammar_1_practise.this, Lesson_4_grammar_1_results.class);

        intent.putExtra("L4G1A0", l4_g1_answer0.getText().toString());
        intent.putExtra("L4G1A1", l4_g1_answer1.getText().toString());
        intent.putExtra("L4G1A2", l4_g1_answer2.getText().toString());
        intent.putExtra("L4G1A3", l4_g1_answer3.getText().toString());
        intent.putExtra("L4G1A4", l4_g1_answer4.getText().toString());
        intent.putExtra("L4G1A5", l4_g1_answer5.getText().toString());
        intent.putExtra("L4G1A6", l4_g1_answer6.getText().toString());
        intent.putExtra("L4G1A7", l4_g1_answer7.getText().toString());
        intent.putExtra("L4G1A8", l4_g1_answer8.getText().toString());
        intent.putExtra("L4G1A9", l4_g1_answer9.getText().toString());
        intent.putExtra("L4G1A10", l4_g1_answer10.getText().toString());
        intent.putExtra("L4G1A11", l4_g1_answer11.getText().toString());



        startActivity(intent);



    }
}
 //TODO: разобраться с разметкой xml