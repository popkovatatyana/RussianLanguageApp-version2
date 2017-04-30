package com.popkova.russianlanguageapp.Lesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.R;

public class Lesson_1_grammar_3_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_1_grammar_3_practise);
    }
    public void Check_L1_grammar_3(View view) {
        EditText l1_g3_answer0 = (EditText)findViewById(R.id.l1_g3_answer0);
        EditText l1_g3_answer1 = (EditText)findViewById(R.id.l1_g3_answer1);
        EditText l1_g3_answer2 = (EditText)findViewById(R.id.l1_g3_answer2);
        EditText l1_g3_answer3 = (EditText)findViewById(R.id.l1_g3_answer3);
        EditText l1_g3_answer4 = (EditText)findViewById(R.id.l1_g3_answer4);
        EditText l1_g3_answer5 = (EditText)findViewById(R.id.l1_g3_answer5);
        EditText l1_g3_answer6 = (EditText)findViewById(R.id.l1_g3_answer6);
        EditText l1_g3_answer7 = (EditText)findViewById(R.id.l1_g3_answer7);
        EditText l1_g3_answer8 = (EditText)findViewById(R.id.l1_g3_answer8);
        EditText l1_g3_answer9 = (EditText)findViewById(R.id.l1_g3_answer9);
        EditText l1_g3_answer10 = (EditText)findViewById(R.id.l1_g3_answer10);
        EditText l1_g3_answer11 = (EditText)findViewById(R.id.l1_g3_answer11);
        EditText l1_g3_answer12 = (EditText)findViewById(R.id.l1_g3_answer12);
        EditText l1_g3_answer13 = (EditText)findViewById(R.id.l1_g3_answer13);
        EditText l1_g3_answer14 = (EditText)findViewById(R.id.l1_g3_answer14);
        EditText l1_g3_answer15 = (EditText)findViewById(R.id.l1_g3_answer15);
        EditText l1_g3_answer16 = (EditText)findViewById(R.id.l1_g3_answer16);
        EditText l1_g3_answer17 = (EditText)findViewById(R.id.l1_g3_answer17);

        Intent intent = new Intent(Lesson_1_grammar_3_practise.this, Lesson_1_grammar_3_results.class);

        intent.putExtra("L1G3A0", l1_g3_answer0.getText().toString());
        intent.putExtra("L1G3A1", l1_g3_answer1.getText().toString());
        intent.putExtra("L1G3A2", l1_g3_answer2.getText().toString());
        intent.putExtra("L1G3A3", l1_g3_answer3.getText().toString());
        intent.putExtra("L1G3A4", l1_g3_answer4.getText().toString());
        intent.putExtra("L1G3A5", l1_g3_answer5.getText().toString());
        intent.putExtra("L1G3A6", l1_g3_answer6.getText().toString());
        intent.putExtra("L1G3A7", l1_g3_answer7.getText().toString());
        intent.putExtra("L1G3A8", l1_g3_answer8.getText().toString());
        intent.putExtra("L1G3A9", l1_g3_answer9.getText().toString());
        intent.putExtra("L1G3A10", l1_g3_answer10.getText().toString());
        intent.putExtra("L1G3A11", l1_g3_answer11.getText().toString());
        intent.putExtra("L1G3A12", l1_g3_answer12.getText().toString());
        intent.putExtra("L1G3A13", l1_g3_answer13.getText().toString());
        intent.putExtra("L1G3A14", l1_g3_answer14.getText().toString());
        intent.putExtra("L1G3A15", l1_g3_answer15.getText().toString());
        intent.putExtra("L1G3A16", l1_g3_answer16.getText().toString());
        intent.putExtra("L1G3A17", l1_g3_answer17.getText().toString());

        startActivity(intent);
    }
}
