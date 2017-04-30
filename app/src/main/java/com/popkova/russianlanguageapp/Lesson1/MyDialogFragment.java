package com.popkova.russianlanguageapp.Lesson1;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

import com.popkova.russianlanguageapp.R;

/**
 * Created by User on 30.04.2017.
 */

public class MyDialogFragment extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState, String errors) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Важное сообщение!")
                .setMessage(errors)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        return builder.create();
    }
}
