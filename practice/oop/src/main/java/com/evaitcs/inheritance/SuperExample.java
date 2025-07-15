package com.evaitcs.inheritance;

/**
 *
 */
public class SuperExample {

  protected String type;

  public SuperExample(String type) {
    this.type = type;
  }

  // TODO: display `type`
  public String identify() {
    return null;
  }
}

class SubSuperExample extends SuperExample {
  public SubSuperExample(String type) {
    // TODO: use super to invoke parent constructor
  }


  @Override
  public String identify() {
    return null;
  }
}
