package com.example.lesson561.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lesson561.R;
import com.example.lesson561.data.Math;
import com.example.lesson561.data.StringGo;
import com.example.lesson561.databinding.ActivityMainBinding;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding ui;
    int a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
        Math math = new Math();
        String[] texts = new StringGo(this).getString(R.string.words);
        ui.tv.setText(Arrays.toString(texts));
        ui.btnSum.setOnClickListener(v -> {
            toInt(a, b);
            ui.tv.setText(String.valueOf(math.Sum(a, b)));
        });
        ui.btnMult.setOnClickListener(v -> {
            toInt(a, b);
            ui.tv.setText(String.valueOf(math.Mult(a, b)));
        });
        ui.btnSub.setOnClickListener(v -> {
            toInt(a, b);
            ui.tv.setText(String.valueOf(math.Sub(a, b)));
        });
        ui.btnDiv.setOnClickListener(v -> {
            toInt(a, b);
            ui.tv.setText(String.valueOf(math.Div(a, b)));
        });

    }

    public void toInt(int a, int b) {
        a = Integer.parseInt(ui.etTxt.getText().toString());
        b = Integer.parseInt(ui.etTxt2.getText().toString());
    }

}