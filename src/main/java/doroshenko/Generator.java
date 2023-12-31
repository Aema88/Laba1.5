package doroshenko;

import doroshenko.bookstore.Book;
import doroshenko.bookstore.BookCash;

import java.util.Random;

public class Generator {
    static Book createBook() throws CloneNotSupportedException{
        BookCash.loadCache();
        Random rand = new Random();
        int max=9999,min=1111;
        int id= rand.nextInt(3 - 1 + 1) + 1;
        Book b= BookCash.getBook(id);
        b.setISBN(rand.nextInt(max - min + 1) + min);
        b.setPages(rand.nextInt(max/90 - min/300 + 1) + min/300);
        return b;
    }
}
