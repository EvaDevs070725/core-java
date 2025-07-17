package com.evaitcs.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompositionExampleTest {

  @Test
  void testCompositionUsesEngine() {
    Engine engine = new Engine();
    CompositionExample car = new CompositionExample(engine);
    assertEquals("Engine started", car.start());
  }

}
