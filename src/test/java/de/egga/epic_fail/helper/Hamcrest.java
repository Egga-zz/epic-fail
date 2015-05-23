package de.egga.epic_fail.helper;

import org.hamcrest.Matcher;

/**
 * @author egga
 */
public class Hamcrest {

    public static <T> void assertThat(T actual, Matcher<? super T> matcher) {
        org.hamcrest.MatcherAssert.assertThat(actual, matcher);
    }
}
