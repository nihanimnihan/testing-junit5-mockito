package com.nihanim.services.springdatajpa;

import com.nihanim.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
@Tag("service")
class OwnerJpaServiceTest {

  OwnerService ownerService;

  @BeforeEach
  void setUp() {
  }

  @Test
  void findByLastName() {}
}