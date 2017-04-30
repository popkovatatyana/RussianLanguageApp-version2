package com.popkova.russianlanguageapp.Lesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.popkova.russianlanguageapp.R;

public class Lesson_1_grammar_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_1_grammar_3);
    }

    public void l1_g3_practise(View view) {
        Intent intent = new Intent (Lesson_1_grammar_3.this, Lesson_1_grammar_3_practise.class);
        startActivity(intent);
    }
}
