package com.evaitcs.abstraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractionExampleTest {


  @Test
  void testInterfaceCanBeImplemented() {
    AbstractionExample example = new AbstractionExample() {
      @Override
      public void performAction() {
        // anonymous implementation
      }
    };
    assertNotNull(example);
  }

}
