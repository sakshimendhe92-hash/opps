import java.util.*;

class Book {
    String title, author, ISBN;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        ISBN = i;
    }
}

class Library {
    ArrayList<Book> list = new ArrayList<>();

    void addBook(Book b) {
        list.add(b);
    }

    void removeBook(String ISBN) {
        list.removeIf(b -> b.ISBN.equals(ISBN));
    }

    void display() {
        for (Book b : list) {
            System.out.println(b.title + " " + b.author + " " + b.ISBN);
        }
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.addBook(new Book("Java", "ABC", "101"));
        l.addBook(new Book("DSA", "XYZ", "102"));

        l.display();
        l.removeBook("101");
        System.out.println("After removal:");
        l.display();
    }
}