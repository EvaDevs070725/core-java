package com.evaitcs.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InheritanceExampleTest {

  @Test
  void testSubclassIsInstanceOfSuperclass() {
    InheritanceExample obj = new SubclassExample();
    assertTrue(obj instanceof InheritanceExample);
  }

  @Test
  void testMethod() {
    InheritanceExample obj = new SubclassExample();
    assertEquals("I am a parent class", obj.describe());
  }
  @Test
  void testOverriddenMethod() {
    InheritanceExample obj = new SubclassExample();
    assertEquals("I am a subclass", obj.describe());
  }

}
