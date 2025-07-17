package com.evaitcs.notes.shape;

public class ShapeExample {

  public static void main(String[] args) {
    Shape[] shapes = new Shape[] {
      new Circle(5),
      new Circle(4),
      new Square(3),
      new Rectangle(4, 4),
      new IsoscelesTriangle(5, 2)
    };


    for (Shape shape : shapes) {
      System.out.println(shape.getDetails());
    }
  }
}
