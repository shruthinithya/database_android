package com.example.user.database;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by USER on 26-09-2017.
 */

public class Message {
    public static void message(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
