package com.popkova.russianlanguageapp.Lesson3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.R;

public class Lesson_3_grammar_3_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_3_grammar_3_practise);
    }
    public void Check_L3_grammar_3(View view) {
        EditText l3_g3_answer0 = (EditText)findViewById(R.id.l3_g3_answer0);
        EditText l3_g3_answer1 = (EditText)findViewById(R.id.l3_g3_answer1);
        EditText l3_g3_answer2 = (EditText)findViewById(R.id.l3_g3_answer2);
        EditText l3_g3_answer3 = (EditText)findViewById(R.id.l3_g3_answer3);
        EditText l3_g3_answer4 = (EditText)findViewById(R.id.l3_g3_answer4);
        EditText l3_g3_answer5 = (EditText)findViewById(R.id.l3_g3_answer5);
        EditText l3_g3_answer6 = (EditText)findViewById(R.id.l3_g3_answer6);
        EditText l3_g3_answer7 = (EditText)findViewById(R.id.l3_g3_answer7);


        Intent intent = new Intent(Lesson_3_grammar_3_practise.this, Lesson_3_grammar_3_results.class);

        intent.putExtra("L3G3A0", l3_g3_answer0.getText().toString());
        intent.putExtra("L3G3A1", l3_g3_answer1.getText().toString());
        intent.putExtra("L3G3A2", l3_g3_answer2.getText().toString());
        intent.putExtra("L3G3A3", l3_g3_answer3.getText().toString());
        intent.putExtra("L3G3A4", l3_g3_answer4.getText().toString());
        intent.putExtra("L3G3A5", l3_g3_answer5.getText().toString());
        intent.putExtra("L3G3A6", l3_g3_answer6.getText().toString());
        intent.putExtra("L3G3A7", l3_g3_answer7.getText().toString());

        startActivity(intent);
    }
}
