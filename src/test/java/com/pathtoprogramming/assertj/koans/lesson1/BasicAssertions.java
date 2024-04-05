package com.pathtoprogramming.assertj.koans.lesson1;

import com.pathtoprogramming.assertj.koans.Koans;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Percentage.withPercentage;

/**
 * How to do Koans:
 * Step 1: Press the Run Button (Place cursor on the Method name to run a single method)
 * Step 2: Read the name of the Method that Failed
 * Step 3: Fill in the blank (___) to make it pass
 * Step 4: Repeat Until Enlightenment
 * Do not change anything except the blank (___)
 */
class BasicAssertions extends Koans {

    @Test
    void basicJUnitAssertions() {
        org.junit.jupiter.api.Assertions.assertEquals("some string", "some string");
        org.junit.jupiter.api.Assertions.assertEquals(13, 13);
        org.junit.jupiter.api.Assertions.assertTrue(true);
    }

    @Test
    void basicAssertJAssertions() {
        assertThat("some string").isEqualTo("some string");
        assertThat(13).isEqualTo(13);
        assertThat(true).isTrue();
    }

    @Test
    void assertingRangesOfNumbers() {
        assertThat(8).isBetween(1, 10);
        assertThat(105).isCloseTo(105, withPercentage(1));
    }

    @Test
    void customErrorDescription() {
        assertThat("assert")
                .as("does not start with correct letters")
                .startsWith("assert");
    }

    @Test
    void assertingStrings() {
        assertThat("10").containsOnlyDigits();
        assertThat("A HELLO").containsIgnoringCase("HELLO");
        assertThat("a b c")
                .as("String must only contain letters and whitespace")
                .matches("[A-Za-z ]*");
    }

    @Test
    void chainingAssertions() {
        assertThat("wow hello assertj is awesome")
                .startsWith("wow")
                .containsAnyOf("assertj", "awesome");
    }
}
