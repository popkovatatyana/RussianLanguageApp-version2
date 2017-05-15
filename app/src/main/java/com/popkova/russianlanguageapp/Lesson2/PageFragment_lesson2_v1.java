package com.popkova.russianlanguageapp.Lesson2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.popkova.russianlanguageapp.Lesson1.PageFragment_lesson1_v1;
import com.popkova.russianlanguageapp.R;

/**
 * Created by User on 30.04.2017.
 */

public class PageFragment_lesson2_v1  extends Fragment{

    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    String [] Examples = {
            "семья ",
            "мать ",
            "отец ",
            "брат ",
            "сестра ",
            "бабушка",
            "дедушка",
            "дядя",
            "тётя",
            "родители",
            "жена",
            "муж",
            "сын",
            "дочь",
            "дети ",
            "внук ",
            "внучка ",
            "двоюродная сестра",
            "двоюродный брат "
    };

    String [] Examples_translation = {
            "family ",
            "mother ",
            "father ",
            "brother",
            "sister",
            "grandmother",
            "grandfather",
            "uncle",
            "aunt ",
            "parents",
            "wife ",
            "husband ",
            "son",
            "daughter",
            "children ",
            "grandson ",
            "granddaughter",
            "cousin (female)",
            "cousin (male)"
    };
    int [] images = {
            R.drawable.l2_1,
            R.drawable.l2_2,
            R.drawable.l2_3,
            R.drawable.l2_4,
            R.drawable.l2_5,
            R.drawable.l2_6,
            R.drawable.l2_7,
            R.drawable.l2_8,
            R.drawable.l2_9,
            R.drawable.l2_10,
            R.drawable.l2_11,
            R.drawable.l2_12,
            R.drawable.l2_13,
            R.drawable.l2_14,
            R.drawable.l2_15,
            R.drawable.l2_16,
            R.drawable.l2_17,
            R.drawable.l2_18,
            R.drawable.l2_19
    };



    int pageNumber;

    public static PageFragment_lesson2_v1 newInstance(int page) {
        PageFragment_lesson2_v1 pageFragment = new PageFragment_lesson2_v1();
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
