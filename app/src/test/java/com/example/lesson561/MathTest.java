package com.example.lesson561;

import com.example.lesson561.data.Math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {
    private Math math;
    @Before
    public void setup() {
        math = new Math();
        System.out.println("BEFORE");
    }

    @Test
    public void sumTest() {
        assertEquals(5, math.Sum(3,2));
        assertEquals(5, math.Sum(-10,15));
        System.out.println("SUM");
    }

    @Test
    public void divTest() {
        assertEquals(2, math.Div(12,6));
        assertEquals(0, math.Div(0,1));
        assertEquals(0,math.Div(1,0));
        System.out.println("DIV");
    }

    @Test
    public void subtractionTest() {
        assertEquals(2, math.Sub(2,0));
        assertEquals(12, math.Sub(14,2));
        assertEquals(15, math.Sub(20,5));
        System.out.println("SUB");
    }

    @Test
    public void multiplicationTest() {
        assertEquals(9, math.Mult(3,3));
        assertEquals(21, math.Mult(3,7));
        assertEquals(3, math.Mult(3,1));
        System.out.println("MULT");
    }

    @Test
    public void reversWordsTest() {
        assertEquals("One Two Three Four", math.reverseWords("Four Three Two One"));
        assertEquals("One Two Three", math.reverseWords("Three Two One"));
        assertEquals("One Two", math.reverseWords("Two One"));
        assertEquals("One", math.reverseWords("One"));
        assertEquals("", math.reverseWords(null));
        System.out.println(math.reverseWords("REVERS"));
    }

    @After
    public void clear() {
        math = null;
        System.out.println("AFTER");
    }
}
