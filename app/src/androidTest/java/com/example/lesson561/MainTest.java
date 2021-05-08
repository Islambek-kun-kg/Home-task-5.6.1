package com.example.lesson561;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.lesson561.ui.MainActivity;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainTest {
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void sumClickTest() {
        onView(withId(R.id.etTxt)).perform(typeText("32"));
        onView(withId(R.id.etTxt2)).perform(typeText("18"));
        onView(withId(R.id.btnSum)).perform(click());
        onView(withId(R.id.tv)).check(matches(withText("50")));
    }

    @Test
    public void subClickTest() {
        onView(withId(R.id.etTxt)).perform(typeText("3"));
        onView(withId(R.id.etTxt2)).perform(typeText("1"));
        onView(withId(R.id.btnSub)).perform(click());
        onView(withId(R.id.tv)).check(matches(withText("2")));
    }

    @Test
    public void multClickTest() {
        onView(withId(R.id.etTxt)).perform(typeText("3"));
        onView(withId(R.id.etTxt2)).perform(typeText("4"));
        onView(withId(R.id.btnMult)).perform(click());
        onView(withId(R.id.tv)).check(matches(withText("12")));
    }

    @Test
    public void divClickTest() {
        onView(withId(R.id.etTxt)).perform(typeText("36"));
        onView(withId(R.id.etTxt2)).perform(typeText("6"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tv)).check(matches(withText("6")));
    }
}
