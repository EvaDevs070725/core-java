package com.evaitcs.notes.shape;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeExampleTest {

  @Test
  @DisplayName("should find area and perimeter of isosceles triangle")
  void getAreaIsoTriangle() {
      /* GIVEN - iso triangle */
      IsoscelesTriangle iso = new IsoscelesTriangle(4, 3);

      /* WHEN - get area */
      double area = iso.getArea();
      double perimeter = iso.getPerimeter();

      /* THEN -  */
    Assertions.assertThat(perimeter)
      .isEqualTo(11);
    Assertions.assertThat(area)
        .isEqualTo(5.5);
  }

  @Test
  @DisplayName("should find area and perimeter of circle")
  void areaPerimeterCircle() {
      /* GIVEN - circle */
      Circle c = new Circle(4);

      /* WHEN - area perimeter */
      double area = c.getArea();
      double perimeter = c.getPerimeter();

      /* THEN -  */
    Assertions.assertThat(perimeter)
      .isEqualTo(25.13272);
    Assertions.assertThat(area)
      .isEqualTo(50.26544);

  }
}
