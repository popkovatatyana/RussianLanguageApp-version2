package com.popkova.russianlanguageapp.Lesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.R;

public class Lesson_1_grammar_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_1_grammar);
    }

    public void l1_g1_practise(View view) {
        Intent intent = new Intent(Lesson_1_grammar_1.this, Lesson_1_grammar_1_practise.class);
        startActivity(intent);
    }

}
