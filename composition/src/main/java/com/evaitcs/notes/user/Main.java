package com.evaitcs.notes.user;

public class Main {
  public static void main(String[] args) {

    User user = new User("devinc", "super-secret-password");

    // something happens throughout the program running

    Address address = new Address();
    user.setAddress(address);

    System.out.println("user = " + user);
  }
}
