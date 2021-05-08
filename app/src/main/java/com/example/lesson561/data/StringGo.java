package com.example.lesson561.data;

import android.content.Context;

public class StringGo {
    private Context context;

    public StringGo(Context context) {
        this.context = context;
    }

    public String[] getString(int id) {
        return context.getString(id).split(" ");
    }
}
