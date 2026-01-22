package Challange._6;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "1111");
        Book book2 = new Book("자바의 안정석", "1111");
        System.out.println(book1);
        System.out.println(book1.equals(book2));
    }
}
