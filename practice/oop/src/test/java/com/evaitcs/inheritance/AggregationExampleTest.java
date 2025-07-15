package com.evaitcs.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AggregationExampleTest {

  @Test
  void testAggregationRetrievesDepartment() {
    Department dept = new Department("HR");
    AggregationExample emp = new AggregationExample(dept);
    assertEquals("HR", emp.getDepartmentName());
  }
}
