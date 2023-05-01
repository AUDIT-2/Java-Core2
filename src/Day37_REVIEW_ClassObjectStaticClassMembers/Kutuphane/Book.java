/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.Kutuphane;

import java.util.ArrayList;

public class Book {
    private static int id = 1000;
    private int bookNumber;
    private String title;
    private String type;
    private String publisher;
    private String ISBN;

    private ArrayList<Author> authors;

    public Book( String title, String type, String publisher, String ISBN) {
        id++;
        setBookNumber(id);
        setTitle(title);
        setType(type);
        setPublisher(publisher);
        setISBN(ISBN);
        authors = new ArrayList<>();
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNumber=" + bookNumber +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", publisher='" + publisher + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", authors=" + authors +
                '}';
    }


}
