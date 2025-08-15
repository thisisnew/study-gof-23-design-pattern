package part1.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Java"));
        bookShelf.appendBook(new Book("Python"));
        bookShelf.appendBook(new Book("C++"));
        bookShelf.appendBook(new Book("C"));

        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.name());
        }
        System.out.println();

        for (Book book : bookShelf) {
            System.out.println(book.name());
        }
        System.out.println();
    }
}
