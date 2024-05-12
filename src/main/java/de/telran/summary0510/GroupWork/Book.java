package de.telran.summary0510.GroupWork;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Serializable{
    private String title;
    private String author;
    private double price;
    private int bookCount;

    public Book(String title, String author, double price, int bookCount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.bookCount = bookCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", bookCount=" + bookCount +
                '}';
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter1", "Joanne K. Rowling", 12.5, 20);
        Book book2 = new Book("Harry Potter2", "Joanne K. Rowling", 17.5, 20);
        Book book3 = new Book("Harry Potter3", "Joanne K. Rowling", 10.8, 20);
        Book book4 = new Book("Harry Potter4", "Joanne K. Rowling", 19.3, 20);
        Book book5 = new Book("Harry Potter5", "Joanne K. Rowling", 21.5, 20);

        List<Book> bookList = new ArrayList<>(Arrays.asList(book1, book2, book3, book4, book5));
        System.out.println(bookList);

        String file = "resources/bookList.txt";
        try (
                FileOutputStream out = new FileOutputStream(file);
                ObjectOutputStream outputStream = new ObjectOutputStream(out)
        ) {

            outputStream.writeObject(bookList);

            System.out.println("Books saved.");
        } catch (IOException e) {
            System.out.println("We have some problem with file " + e.getMessage());
            e.printStackTrace();
        }


        try (
                FileInputStream inputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ) {
            List<Book> deserializedListBook = (List<Book>) objectInputStream.readObject();
            for (Book book: deserializedListBook){
                System.out.println(book);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("We have some problem with file " + e.getMessage());
            e.printStackTrace();

        }


    }
}
