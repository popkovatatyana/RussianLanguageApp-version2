package com.popkova.russianlanguageapp.Lesson9;

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

public class PageFragment_lesson9_v1 extends Fragment {
    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    String [] Examples = {
            "продукты",
            "фрукты",
            "овощи",
            "мясо ",
            "молоко",
            "вода ",
            "рыба ",
            "курица",
            "хлеб",
            "супермаркет ",
            "торговый центр",
            "продуктовый магазин ",
            "одежда ",
            "обувь ",
            "парфюмерный магазин ",
            "косметика ",
            "книжный магазин ",
            "магазин электроники ",
            "ювелирный магазин",
            "чек "
    };

    String [] Examples_translation = {
            "grocery",
            "fruits ",
            "vegetables",
            "meat",
            "milk ",
            "water ",
            "fish",
            "chicken ",
            "bread ",
            "supermarket ",
            "shopping center",
            "grocery shop",
            "clothes ",
            "shoes ",
            "perfumery",
            "cosmetics",
            "book shop",
            "electronic store",
            "jewelry store",
            "receipt "
    };

    int [] images = {
            R.drawable.l3_1,
            R.drawable.l3_2,
            R.drawable.l3_3,
            R.drawable.l3_4,
            R.drawable.l3_5,
            R.drawable.l3_6,
            R.drawable.l3_7,
            R.drawable.l3_8,
            R.drawable.l3_9,
            R.drawable.l3_10,
            R.drawable.l3_11,
            R.drawable.l3_12,
            R.drawable.l3_13,
            R.drawable.l3_14,
            R.drawable.l3_15,
            R.drawable.l3_16,
            R.drawable.l3_17,
            R.drawable.l3_18,
            R.drawable.l3_1,
            R.drawable.l3_2,
    };



    int pageNumber;

    public static PageFragment_lesson9_v1 newInstance(int page) {
        PageFragment_lesson9_v1 pageFragment = new PageFragment_lesson9_v1();
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
