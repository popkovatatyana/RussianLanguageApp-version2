package com.popkova.russianlanguageapp.Lesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.R;

public class Lesson_1_grammar_1_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_1_grammar_1_practise);
    }

    public void Check_L1_grammar_1(View view) {
        EditText l1_g1_answer0 = (EditText)findViewById(R.id.l1_g1_answer0);
        EditText l1_g1_answer1 = (EditText)findViewById(R.id.l1_g1_answer1);
        EditText l1_g1_answer2 = (EditText)findViewById(R.id.l1_g1_answer2);
        EditText l1_g1_answer3 = (EditText)findViewById(R.id.l1_g1_answer3);
        EditText l1_g1_answer4 = (EditText)findViewById(R.id.l1_g1_answer4);
        EditText l1_g1_answer5 = (EditText)findViewById(R.id.l1_g1_answer5);
        EditText l1_g1_answer6 = (EditText)findViewById(R.id.l1_g1_answer6);
        EditText l1_g1_answer7 = (EditText)findViewById(R.id.l1_g1_answer7);
        EditText l1_g1_answer8 = (EditText)findViewById(R.id.l1_g1_answer8);
        EditText l1_g1_answer9 = (EditText)findViewById(R.id.l1_g1_answer9);
        EditText l1_g1_answer10 = (EditText)findViewById(R.id.l1_g1_answer10);
        EditText l1_g1_answer11 = (EditText)findViewById(R.id.l1_g1_answer11);
        EditText l1_g1_answer12 = (EditText)findViewById(R.id.l1_g1_answer12);
        EditText l1_g1_answer13 = (EditText)findViewById(R.id.l1_g1_answer13);
        EditText l1_g1_answer14 = (EditText)findViewById(R.id.l1_g1_answer14);
        EditText l1_g1_answer15 = (EditText)findViewById(R.id.l1_g1_answer15);
        EditText l1_g1_answer16 = (EditText)findViewById(R.id.l1_g1_answer16);
        EditText l1_g1_answer17 = (EditText)findViewById(R.id.l1_g1_answer17);
        EditText l1_g1_answer18 = (EditText)findViewById(R.id.l1_g1_answer18);
        EditText l1_g1_answer19 = (EditText)findViewById(R.id.l1_g1_answer19);
        EditText l1_g1_answer20 = (EditText)findViewById(R.id.l1_g1_answer20);
        EditText l1_g1_answer21 = (EditText)findViewById(R.id.l1_g1_answer21);
        EditText l1_g1_answer22 = (EditText)findViewById(R.id.l1_g1_answer22);
        EditText l1_g1_answer23 = (EditText)findViewById(R.id.l1_g1_answer23);
        EditText l1_g1_answer24 = (EditText)findViewById(R.id.l1_g1_answer24);
        EditText l1_g1_answer25 = (EditText)findViewById(R.id.l1_g1_answer25);
        EditText l1_g1_answer26 = (EditText)findViewById(R.id.l1_g1_answer26);
        EditText l1_g1_answer27 = (EditText)findViewById(R.id.l1_g1_answer27);
        EditText l1_g1_answer28 = (EditText)findViewById(R.id.l1_g1_answer28);
        EditText l1_g1_answer29 = (EditText)findViewById(R.id.l1_g1_answer29);
        EditText l1_g1_answer30 = (EditText)findViewById(R.id.l1_g1_answer30);
        EditText l1_g1_answer31 = (EditText)findViewById(R.id.l1_g1_answer31);
        EditText l1_g1_answer32 = (EditText)findViewById(R.id.l1_g1_answer32);

        Intent intent = new Intent(Lesson_1_grammar_1_practise.this, Lesson_1_grammar_1_results.class);
        intent.putExtra("L1G1A0", l1_g1_answer0.getText().toString());
        intent.putExtra("L1G1A1", l1_g1_answer1.getText().toString());
        intent.putExtra("L1G1A2", l1_g1_answer2.getText().toString());
        intent.putExtra("L1G1A3", l1_g1_answer3.getText().toString());
        intent.putExtra("L1G1A4", l1_g1_answer4.getText().toString());
        intent.putExtra("L1G1A5", l1_g1_answer5.getText().toString());
        intent.putExtra("L1G1A6", l1_g1_answer6.getText().toString());
        intent.putExtra("L1G1A7", l1_g1_answer7.getText().toString());
        intent.putExtra("L1G1A8", l1_g1_answer8.getText().toString());
        intent.putExtra("L1G1A9", l1_g1_answer9.getText().toString());
        intent.putExtra("L1G1A10", l1_g1_answer10.getText().toString());
        intent.putExtra("L1G1A11", l1_g1_answer11.getText().toString());
        intent.putExtra("L1G1A12", l1_g1_answer12.getText().toString());
        intent.putExtra("L1G1A13", l1_g1_answer13.getText().toString());
        intent.putExtra("L1G1A14", l1_g1_answer14.getText().toString());
        intent.putExtra("L1G1A15", l1_g1_answer15.getText().toString());
        intent.putExtra("L1G1A16", l1_g1_answer16.getText().toString());
        intent.putExtra("L1G1A17", l1_g1_answer17.getText().toString());
        intent.putExtra("L1G1A18", l1_g1_answer18.getText().toString());
        intent.putExtra("L1G1A19", l1_g1_answer19.getText().toString());
        intent.putExtra("L1G1A20", l1_g1_answer20.getText().toString());
        intent.putExtra("L1G1A21", l1_g1_answer21.getText().toString());
        intent.putExtra("L1G1A22", l1_g1_answer22.getText().toString());
        intent.putExtra("L1G1A23", l1_g1_answer23.getText().toString());
        intent.putExtra("L1G1A24", l1_g1_answer24.getText().toString());
        intent.putExtra("L1G1A25", l1_g1_answer25.getText().toString());
        intent.putExtra("L1G1A26", l1_g1_answer26.getText().toString());
        intent.putExtra("L1G1A27", l1_g1_answer27.getText().toString());
        intent.putExtra("L1G1A28", l1_g1_answer28.getText().toString());
        intent.putExtra("L1G1A29", l1_g1_answer29.getText().toString());
        intent.putExtra("L1G1A30", l1_g1_answer30.getText().toString());
        intent.putExtra("L1G1A31", l1_g1_answer31.getText().toString());
        intent.putExtra("L1G1A32", l1_g1_answer32.getText().toString());

        startActivity(intent);
    }
}
