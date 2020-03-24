package com.nihanim;

import org.junit.jupiter.api.*;

@Tag("repeated")
public interface ModelRepeatedTests {

    @BeforeEach
    default void beforeEachConsoleOutputer(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running Tests: " + testInfo.getDisplayName() + " * " + repetitionInfo.getCurrentRepetition() +
                " - " + repetitionInfo.getTotalRepetitions());
    }
}
