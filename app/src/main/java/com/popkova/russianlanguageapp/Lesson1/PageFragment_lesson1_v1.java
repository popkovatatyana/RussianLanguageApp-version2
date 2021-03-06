package com.popkova.russianlanguageapp.Lesson1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.popkova.russianlanguageapp.R;

/**
 * Created by User on 23.04.2017.
 */

public class PageFragment_lesson1_v1 extends Fragment {
    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    String [] Examples = {
            "Привет!",
            "Здравствуйте!",
            "Меня зовут Таня. А тебя?",
            "Меня зовут Саша. А Bас?",
            "Как её зовут? Её зовут Катя. ",
            "Как его зовут? Его зовут Максим.",
            "Как их зовут? Их зовут Кристина и Катя.",
            "Спасибо.",
            "Очень приятно.",
            "Как у тебя дела? ",
            "Можно с вами познакомиться?",
            "Пока! ",
            "До свидания! ",
            "Хорошего дня!",
            "Доброе утро!",
            "Добрый день!",
            "Добрый вечер!",
            "Спокойной ночи!",
    };

    String [] Examples_translation = {
            "Hello (informal)",
            "Hello (formal)",
            "My name is Tanya. And you? (informal)",
            "My name is Sasha. And you? (formal)",
            "What is her name? Her name is Katya. ",
            "What is his name? His name is Maxim. ",
            "What are their names? Their names are Kristina and Katya. ",
            "Thank you",
            "Nice to meet you",
            "How are you? ",
            "Can I ask you out some day?",
            "Bye!",
            "Good bye!",
            "Have a nice day!",
            "Good morning!",
            "Good afternoon!",
            "Good evening!",
            "Good night!",
    };
    int [] images = {
            R.drawable.l1_1,
            R.drawable.l1_2,
            R.drawable.l1_3,
            R.drawable.l1_4,
            R.drawable.l1_5,
            R.drawable.l1_6,
            R.drawable.l1_7,
            R.drawable.l1_8,
            R.drawable.l1_9,
            R.drawable.l1_10,
            R.drawable.l1_11,
            R.drawable.l1_12,
            R.drawable.l1_13,
            R.drawable.l1_14,
            R.drawable.l1_15,
            R.drawable.l1_16,
            R.drawable.l1_17,
            R.drawable.l1_18
    };



    int pageNumber;

    public static PageFragment_lesson1_v1 newInstance(int page) {
        PageFragment_lesson1_v1 pageFragment = new PageFragment_lesson1_v1();
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
