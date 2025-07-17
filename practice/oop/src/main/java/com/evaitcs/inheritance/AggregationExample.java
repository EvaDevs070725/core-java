package com.evaitcs.inheritance;

/**
 * Demonstrates aggregation - weaker "has-a" relationship.
 */
public class AggregationExample {
  private Department department;

  public AggregationExample(Department department) {
    this.department = department;
  }

  public String getDepartmentName() {
    return null;
  }
}

class Department {
  private String name;

  public Department(String name) {
    this.name = name;
  }

  public String getName() {
    return null;
  }
}
