package com.popkova.russianlanguageapp.Lesson2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.popkova.russianlanguageapp.R;

public class Lesson_2_grammar_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_2_grammar_1);
    }

    public void l2_g1_practise(View view) {
        Intent intent  = new Intent (Lesson_2_grammar_1.this, Lesson_2_grammar_1_practise.class);
        startActivity(intent);
    }

    public void l2_g1_practise_2(View view) {
        Intent intent  = new Intent (Lesson_2_grammar_1.this, Lesson_2_grammar_2_practise.class);
        startActivity(intent);
    }
}
