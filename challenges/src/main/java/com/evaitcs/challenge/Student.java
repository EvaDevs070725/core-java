package com.evaitcs.challenge;

/**
 * Create a Student class with the following fields (all private):
 *
 * name
 * grade
 *
 * Write:
 *
 * A constructor to set name and grade
 *
 * Getters for both fields
 *
 * A setter for grade (should only allow grades between 0 and 100)
 *
 * A method printInfo() that prints name and grade
 *
 */
public class Student {
  private String name;
  private int grade;

  public void setName(String name) {
    if (name != null && name.length() > 0) {
      this.name = name;
    } else {
      System.out.println("Invalid name!");
    }
  }

  public void setGrade(int grade) {
    if (grade >= 0 && grade <= 100) {
      this.grade = grade;
    } else {
      System.out.println("Invalid grade!");
    }
  }

  public void printInfo() {
    System.out.println("Name: " + name);
    System.out.println("Grade: " + grade);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.setName("Alice");
    s.setGrade(85);
    s.printInfo();
  }
}
