package com.nihanim.model;

import com.nihanim.ModelTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTests {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1L, "Nihan", "Guner");
        owner.setCity("İstanbul");
        owner.setTelephone("53000000");

        assertAll("Properties Test",
                ()-> assertAll( "Person properties",
                        ()-> assertEquals("Nihan", owner.getFirstName()),
                        ()-> assertEquals("Guner", owner.getLastName())),
                ()-> assertAll("Owner properties",
                        () -> assertEquals("İstanbul", owner.getCity()),
                        () -> assertEquals("53000000", owner.getTelephone())
                ));
    }

}