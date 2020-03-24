package com.nihanim.model;

import com.nihanim.ModelTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests {

    @Test
    void groupAssertions() {
        //given
        Person person = new Person(1L, "Nihan", "Guner");
        //then
        assertAll( "Test Props Set",
                () -> assertEquals(person.getFirstName(), "Nihan", "Firstname failed"),
                () -> assertEquals(person.getLastName(), "Guner", "Lastname failed"));
    }

}