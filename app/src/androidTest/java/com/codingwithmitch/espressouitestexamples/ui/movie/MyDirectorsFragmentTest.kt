package com.codingwithmitch.espressouitestexamples.ui.movie

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.codingwithmitch.espressouitestexamples.R
import junit.framework.TestCase
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MyDirectorsFragmentTest {

@get:Rule
val activityRule = ActivityScenarioRule(MainActivity::class.java)
    @Test
        fun isDirectorsListVisible() {
            val directors = "R.J. Stewart\nJames Vanderbilt\n"

            onView(withId(R.id.movie_directiors)).perform(click())
            onView(allOf(withId(R.id.directors_text), withText(directors))).check(matches(isDisplayed()))



        }





}