package com.popkova.russianlanguageapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.popkova.russianlanguageapp.Lesson1.Lesson_1;
import com.popkova.russianlanguageapp.Lesson10.Lesson_10;
import com.popkova.russianlanguageapp.Lesson2.Lesson_2;
import com.popkova.russianlanguageapp.Lesson3.Lesson_3;
import com.popkova.russianlanguageapp.Lesson4.Lesson_4;
import com.popkova.russianlanguageapp.Lesson5.Lesson_5;
import com.popkova.russianlanguageapp.Lesson6.Lesson_6;
import com.popkova.russianlanguageapp.Lesson7.Lesson_7;
import com.popkova.russianlanguageapp.Lesson8.Lesson_8;
import com.popkova.russianlanguageapp.Lesson9.Lesson_9;

public class ListActivity extends android.app.ListActivity {
    final static int number = 10;
    final String [] Lessons = new String [number];
    private ArrayAdapter<String> mArrayAdapter;

    public void LessonsCreation(int number){
        String NameOfLesson = "Lesson ";
        for (int i=0; i<number; i++){
            int numberFollowing = i+1;
            String numberName  = "" + numberFollowing;
            Lessons[i] = new String(NameOfLesson.concat(numberName));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LessonsCreation(number);
        mArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Lessons);
        setListAdapter(mArrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if (position == 0){
            Intent intent = new Intent( ListActivity.this, Lesson_1.class);
            startActivity(intent);
        }
        if (position == 1){
            Intent intent = new Intent( ListActivity.this, Lesson_2.class);
            startActivity(intent);
        }
        if (position == 2){
            Intent intent = new Intent( ListActivity.this, Lesson_3.class);
            startActivity(intent);
        }
        if (position == 3){
            Intent intent = new Intent( ListActivity.this, Lesson_4.class);
            startActivity(intent);
        }
        if (position == 4){
            Intent intent = new Intent( ListActivity.this, Lesson_5.class);
            startActivity(intent);
        }
        if (position == 5){
            Intent intent = new Intent( ListActivity.this, Lesson_6.class);
            startActivity(intent);
        }
        if (position == 6){
            Intent intent = new Intent( ListActivity.this, Lesson_7.class);
            startActivity(intent);
        }
        if (position == 7){
            Intent intent = new Intent( ListActivity.this, Lesson_8.class);
            startActivity(intent);
        }
        if (position == 8){
            Intent intent = new Intent( ListActivity.this, Lesson_9.class);
            startActivity(intent);
        }
        if (position == 9){
            Intent intent = new Intent( ListActivity.this, Lesson_10.class);
            startActivity(intent);
        }
    }
}
