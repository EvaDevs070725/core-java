package com.evaitcs.notes;
class Book{
  private String title;
  private String author;

  public Book(String title, String author){
    this.title = title;
    this.author = author;
  }
}

class Library{
  private Book book;

  public void addBook(Book b){
    this.book = b;
  }

  public void showBook(){
    if(book != null){
      System.out.print(book);
    }
  }
  public static void main(String[] args) {

  }

}
public class Main {
  public static void main(String[] args) {
    Book b = new Book("title","author");
    Library L = new Library();

    L.addBook(b);
    L.showBook();
  }
}
