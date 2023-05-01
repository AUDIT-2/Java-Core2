/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.Kutuphane;

public class LibrayProgram {
    public static void main(String[] args) {
        Library library = new Library("Halk Kütüphanesi","Atatürk Caddesi no:1923");

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

       /* library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);*/

        //VarArgs
        library.addBook(book,book1,book2);

        System.out.println("library = " + library);

        library.listBooks();

        library.listAuthorsBooks("Anonim");
        library.listAuthorsBooks("Yaşar Kemal");
        library.listAuthorsBooks("Atatürk");
    }
}
