package com.evaitcs.notes.shape;

public abstract class Triangle implements Shape {

  protected final int a;
  protected final int b;
  protected final int c;

  protected Triangle(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }



  @Override
  public double getPerimeter() {
    return a + b + c;
  }
}
