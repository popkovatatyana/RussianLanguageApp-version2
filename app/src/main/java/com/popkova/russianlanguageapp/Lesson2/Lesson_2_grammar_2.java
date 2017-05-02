package com.popkova.russianlanguageapp.Lesson2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.popkova.russianlanguageapp.R;

public class Lesson_2_grammar_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_2_grammar_2);
    }

    public void l2_g2_practise(View view) {
        Intent intent  = new Intent (Lesson_2_grammar_2.this, Lesson_2_grammar_3_practise.class);
        startActivity(intent);
    }

}
