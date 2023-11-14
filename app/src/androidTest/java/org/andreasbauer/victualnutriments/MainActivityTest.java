package org.andreasbauer.victualnutriments;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.containsString;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testLogScore() {
        onView(withId(R.id.logBtn))
                .perform(click());

        onView(withId(R.id.scoreLabel))
                .check(matches(withText(containsString("last score:"))));
    }

    @Test
    public void testSwitchToSecondFragment() {
        onView(withId(R.id.button_first))
                .perform(click());

        onView(withId(R.id.secondFragment))
                .check(matches(isDisplayed()));
    }

}
