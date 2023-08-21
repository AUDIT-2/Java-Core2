/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.Kutuphane;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private String name;
    private String address;

    private static ArrayList<Book> books;

    static {
        books = new ArrayList<>();
        Book book = new Book("Nutuk","Tarih","TR-Yayınevi","ISBN-78128713");
        Book book1 = new Book("Çalıkuşu","Roman","ABC-Yayınevi","ISBN-79828713");
        Book book2 = new Book("İnce Memed","Roman","ABC-Yayınevi","ISBN-728713");

        Author author = new Author("M.Kemal");
        Author author1 = new Author("Atatürk");
        Author author2 = new Author("Reşat Nuri Gültekin");
        Author author3 = new Author("Anonim");

        book.addAuthor(author);
        book.addAuthor(author1);

        book.addAuthor(author3);
        book1.addAuthor(author2);
        book1.addAuthor(author3);

        book2.addAuthor(new Author("Yaşar Kemal"));

        books.add(book);
        books.add(book1);
        books.add(book2);

    }
    public Library(String name, String address) {
        setName(name);
        setAddress(address);
       // this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void addBook(Book... books){
        //Old way
       /* for (Book book:books){
            this.books.add(book);
        }*/

        this.books.addAll(Arrays.asList(books));
    }

    public void listBooks(){
        for (Book book:books){
            System.out.println("book = " + book);
        }
    }

    public void listAuthorsBooks(String name){
        System.out.println("Name of Author : " + name);
        System.out.println("------------------------------");
        System.out.println("Books :");
        for (Book book:books){
            for (Author author: book.getAuthors()){
                if(author.getName().equalsIgnoreCase(name)){
                  System.out.println("   " + book.getInfo());
                }
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", books=" + books +
                '}';
    }
}
