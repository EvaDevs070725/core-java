package com.evaitcs.principles;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

  @Test
  void testEncapsulation() {
    Person person = new Person();
    person.setName("Alicia");

    assertThat(person.getName())
      .isEqualTo("Alicia");
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
  @DisplayName("should getDetails")
  void getDetailsPersonSuccess() {
      /* GIVEN - person */
      Person person = new Person();
      person.setName("Alicia");

      /* WHEN - get details */
      String details = person.getDetails();

      /* THEN - success */
      Assertions.assertThat(details)
        .isEqualTo("Alicia");

  }

}
