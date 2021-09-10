package com.codingwithmitch.espressouitestexamples.ui.movie


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.codingwithmitch.espressouitestexamples.R
import com.codingwithmitch.espressouitestexamples.data.DummyMovies.THE_RUNDOWN
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)


class MyMovieDetailFragmentTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun isMovieDetailVisible() {
        val movie = THE_RUNDOWN

        onView(withId(R.id.movie_title)).check(matches(withText(movie.title)))
        onView(withId(R.id.movie_description)).check(matches(withText(movie.description)))

    }
}