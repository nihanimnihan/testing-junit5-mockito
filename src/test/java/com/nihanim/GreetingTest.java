package com.nihanim;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

  Greeting greeting;

  @BeforeAll
  static void beforeAll() {
    System.out.println("In Before All... I called only once!");
  }

  @BeforeEach
  void setUp() {
    System.out.println("In Before Each...");
    greeting = new Greeting();
  }

  @Test
  void helloWorld() {

  }

  @Test
  void testHelloWorld() {

  }

  @AfterEach
  void tearDown() {
    System.out.println("In After Each...");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("In After All... I called only once!");
  }
}