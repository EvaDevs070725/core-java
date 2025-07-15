package com.evaitcs.inheritance;

/**
 * Demonstrates composition - "has-a" relationship.
 */
public class CompositionExample {
  private Engine engine;

  public CompositionExample(Engine engine) {
    this.engine = engine;
  }

  public String start() {
    return null;
  }
}

class Engine {
  public String ignite() {
    return null;
  }
}
