package com.popkova.russianlanguageapp.Lesson2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.popkova.russianlanguageapp.R;

/**
 * Created by User on 30.04.2017.
 */

public class PageFragment_lesson2_v2 extends Fragment{

    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";

    String [] Examples = {"﻿Америка – американец, американка, американцы",
            "Канада – канадец, канадка, канадцы",
            "Мексика – мексиканец, мексиканка, мексиканцы",
            "Япония – японец, японка, японцы",
            "Испания – испанец, испанка, испанцы",
            "Италия – итальянец, итальянка, итальянцы ",
            "Германия – немец, немка, немцы",
            "Англия – англичанин, англичанка, англичане",
            "Россия – русский, русская, русские "
    };

    String [] Examples_translation = {
            "America – American (m, f, Pl)",
            "Canada – Canadian (m, f, Pl)",
            "Mexico – Mexican (m, f, Pl)",
            "Japan – Japanese (m, f, Pl)",
            "Spain – Spanish (m, f, Pl)",
            "Italy – Italian (m, f, Pl)",
            "Germany – German (m, f, Pl) ",
            "England – English (m, f, Pl)",
            "Russia – Russian (m, f, Pl)"
    };
    int [] images = {
            R.drawable.l2_2_1,
            R.drawable.l2_2_2,
            R.drawable.l2_2_3,
            R.drawable.l2_2_4,
            R.drawable.l2_2_5,
            R.drawable.l2_2_6,
            R.drawable.l2_2_7,
            R.drawable.l2_2_8,
            R.drawable.l2_2_9

    };



    int pageNumber;

    public static PageFragment_lesson2_v2 newInstance(int page) {
        PageFragment_lesson2_v2 pageFragment = new PageFragment_lesson2_v2();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
        pageFragment.setArguments(arguments);
        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lesson_1_vocabulary_1_fragment, null);

        TextView tvPage = (TextView) view.findViewById(R.id.tvPage);
        TextView tvPage_translate = (TextView) view.findViewById(R.id.tvPage_translate);
        ImageView image = (ImageView) view.findViewById(R.id.photo);
        tvPage.setText(Examples[pageNumber]);
        tvPage_translate.setText(Examples_translation[pageNumber]);
        image.setImageResource(images[pageNumber]);

        return view;
    }

}
