package com.evaitcs.notes.shape;

public class IsoscelesTriangle extends Triangle {

  private final int base;
  private final int side;

  /**
   * Has two sides of equal length
   *
   * @param side represents matching side lengths
   * @param base represents single side
   */
  protected IsoscelesTriangle(int side, int base) {
    super(base, side, side);
    this.side = side;
    this.base = base;
  }

  /**
   * Geometrically determines height from side
   * @return height
   */
  public double getHeight() {
    double b = (double) base / 2;

    return Math.sqrt(
      Math.pow(side, 2) - Math.pow(b, 2));
  }


  @Override
  public double getArea() {
    return base * getHeight();
  }
}
