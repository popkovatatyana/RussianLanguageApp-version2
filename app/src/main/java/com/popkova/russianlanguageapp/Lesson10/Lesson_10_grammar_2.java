package com.popkova.russianlanguageapp.Lesson10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.popkova.russianlanguageapp.R;

public class Lesson_10_grammar_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_10_grammar_2);
    }

    public void l10_g2_practise(View view) {
        Intent intent = new Intent (Lesson_10_grammar_2.this, Lesson_10_grammar_2_practise.class);
        startActivity(intent);
    }
}
