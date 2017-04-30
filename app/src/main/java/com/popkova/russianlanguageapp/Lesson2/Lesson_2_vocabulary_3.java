package com.popkova.russianlanguageapp.Lesson2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.popkova.russianlanguageapp.R;

public class Lesson_2_vocabulary_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_2_vocabulary_3);
    }

    public void Go_to_Lesson3(View view) {
        Intent intent =  new Intent(Lesson_2_vocabulary_3.this, Lesson_2.class);
        startActivity(intent);
    }
}
