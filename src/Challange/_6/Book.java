package Challange._6;

import java.util.Objects;

public class Book {
    private String title;
    private String isbn;

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    @Override
    public String toString(){
        String data = "Book{title= '" + title + "', isbn= '" + isbn + "'}";
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
