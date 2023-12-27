package doroshenko.bookstore;

import java.util.HashMap;
import java.util.Map;

public class BookCash {
    private static final Map<Integer, Book > bookMap = new HashMap<>();

    public static Book getBook(int id) throws CloneNotSupportedException {
        Book toBeClonedBook = bookMap.get(id);
        return (Book) toBeClonedBook.clone();
    }

    public static void loadCache() {
        Book_fantasy fb1 = new Book_fantasy();
        bookMap.put(1, fb1);

        Book_comedia cb1 = new Book_comedia();
        cb1.setColor(true);
        bookMap.put(2, cb1);

        Book_thriller hb1 = new Book_thriller();
        cb1.setColor(true);
        bookMap.put(3, hb1);
    }
}
