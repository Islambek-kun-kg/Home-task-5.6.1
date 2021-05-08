package com.example.lesson561.data;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Math {
    public int Sum(int a, int b) {
        return a + b;
    }

    public int Div(int a, int b) {
        if (b == 0) return 0;
        else return a / b;
    }

    public int Mult(int a, int b) {
        return a * b;
    }

    public int Sub(int a, int b) {
        return a - b;
    }

    public String reverseWords(String txt) {
        if (txt == null) {
            return "";
        } else {
            String[] texts = txt.split(" ");
            Collections.reverse(Arrays.asList(texts));
            StringBuilder builder = new StringBuilder();
            int count = texts.length;
            for (String txt1 : texts) {
                count--;
                if (count == 0) builder.append(txt1);
                else builder.append(txt1).append(" ");
            }
            return builder.toString();
        }
    }
}
