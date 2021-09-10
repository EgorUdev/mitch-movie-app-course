package com.codingwithmitch.espressouitestexamples.ui.movie

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MyStarActorsFragmentTest::class,
    MyDirectorsFragmentTest::class,
    MyMovieDetailFragmentTest::class,
    MovieNavigationTest::class
)
class MyTestSuite
