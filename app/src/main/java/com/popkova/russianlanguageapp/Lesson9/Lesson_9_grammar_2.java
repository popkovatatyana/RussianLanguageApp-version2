package com.popkova.russianlanguageapp.Lesson9;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.popkova.russianlanguageapp.R;

public class Lesson_9_grammar_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_9_grammar_2);
    }

    public void l9_g2_practise(View view) {
        Intent intent = new Intent (Lesson_9_grammar_2.this, Lesson_9_grammar_2_practise.class);
        startActivity(intent);
    }
}
