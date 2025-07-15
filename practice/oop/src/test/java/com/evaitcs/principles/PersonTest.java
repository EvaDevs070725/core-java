package com.evaitcs.principles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

  @Test
  void testEncapsulation() {
    Person person = new Person();

  }

  @Test
  void testInheritance() {
    Employee employee = new Employee("Alice", "Developer");
    assertTrue(employee instanceof Person);
  }

  @Test
  void testPolymorphism() {
    Person person = new Employee("Bob", "Manager");
    assertEquals("Employee: Bob - Manager", person.getDetails());
  }

  @Test
  void testOverloading() {

  }

}
