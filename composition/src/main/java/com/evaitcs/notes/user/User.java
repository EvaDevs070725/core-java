package com.evaitcs.notes.user;

public class User {

  private String username;
  private String password;

  private Address address;
  private ContactInfo contactInfo;

  public User(String username, String password, Address address, ContactInfo contactInfo) {
    this.username = username;
    this.password = password;
    this.address = address;
    this.contactInfo = contactInfo;
  }

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  @Override
  public String toString() {
    return "User{" +
      "username='" + username + '\'' +
      ", password='" + password + '\'' +
      ", address=" + address +
      ", contactInfo=" + contactInfo +
      '}';
  }
}
