package com.popkova.russianlanguageapp.Lesson6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.popkova.russianlanguageapp.R;

public class Lesson_6_grammar_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_6_grammar_1);
    }

    public void l6_g1_practise(View view) {
        Intent intent = new Intent (Lesson_6_grammar_1.this, Lesson_6_grammar_1_practise.class);
        startActivity(intent);
    }
}
