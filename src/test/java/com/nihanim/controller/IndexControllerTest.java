package com.nihanim.controller;

import com.nihanim.ControllerTests;
import com.nihanim.exception.ValueNotfoundexception;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest implements ControllerTests {

  IndexController indexController;

  @BeforeEach
  void setUp() {
    indexController = new IndexController();
  }

  @Test
  @DisplayName("Test Index")
  void index() {
    assertEquals("index", indexController.index());
    assertEquals("index", indexController.index(), "Wrong view returned");
    assertEquals("index", indexController.index(), () -> "This is expensive wrong message");
    /*Rich Library AssertJ example*/
    Assertions.assertThat(indexController.index()).isEqualTo("index");
  }

  @Test
  @DisplayName("Test Exception")
  void oupsHandler() {
    assertThrows(ValueNotfoundexception.class, () -> {
      indexController.oupsHandler();
    });
  }

  @EnabledOnOs(OS.MAC)
  @Test
  void testOnMac() {}

  @EnabledOnOs(OS.WINDOWS)
  @Test
  void testOnWindows() {}

  @EnabledOnJre(JRE.JAVA_11)
  @Test
  void testOnJava11() {}

  @EnabledOnJre(JRE.JAVA_8)
  @Test
  void testOnJava8() {}

  @EnabledIfEnvironmentVariable(named="USER", matches = "macbookpro")
  @Test
  void testOnUserMacbookpro() {}

  @EnabledIfEnvironmentVariable(named="USER", matches = "nihanim")
  @Test
  void testOnUserNihanim() {}


}