package com.codingwithmitch.espressouitestexamples.ui.movie

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.codingwithmitch.espressouitestexamples.R
import junit.framework.TestCase
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MyStarActorsFragmentTest{
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun isStarActorsVisible() {
        val starActors = "Dwayne Johnson\nSeann William Scott\nRosario Dawson\nChristopher Walken\n"

        onView(withId(R.id.movie_star_actors)).perform(click())
        onView(withId(R.id.star_actors_text)).check(matches(withText(starActors)))
    }
}
