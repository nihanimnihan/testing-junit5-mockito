package com.nihanim.model;


import com.nihanim.ModelRepeatedTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class PersonalRepeatTests implements ModelRepeatedTests {

    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
        /*This test should be repeated 10 times*/
    }

    @RepeatedTest(value = 5, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("My Assigment Repeated Test")
    void myAssigmentRepeatedTest() {
        /*This test should be repeated 10 times*/
    }
}
