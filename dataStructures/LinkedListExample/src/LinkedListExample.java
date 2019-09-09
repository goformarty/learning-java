import java.util.LinkedList;
import java.util.List;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class LinkedListExample {
    public static void main(String[] Args) {
        List<Book> bookList = new LinkedList<>();
        Book b1 = new Book(101, "Title A", "Author A", "Publisher A", 8);
        Book b2 = new Book(102, "Title B", "Author B", "Publisher B", 16);
        Book b3 = new Book(103, "Title C", "Author C", "Publisher C", 10);
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        // traverse list
        for (Book book:bookList) {
            System.out.println(book.id + " " + book.name + " " + book.author + " " + book.publisher + " " + book.quantity);
        }
    }

}


