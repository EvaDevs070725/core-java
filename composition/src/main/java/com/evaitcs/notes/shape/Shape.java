package com.evaitcs.notes.shape;

public interface Shape {

  double getArea();
  double getPerimeter();

  default String getDetails() {
    return "Shape {" +
      "area=" + getArea() + ", " +
      "perimeter=" + getPerimeter() + "}";
  }
}
