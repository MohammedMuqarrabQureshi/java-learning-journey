// Q5 — Book

// Create:

// Book

// Fields:

// isbn
// title
// author
// price

// Create:

// displayBook()

// Create three books.

public class Book {
    String isbn;
    String title;
    String author;
    double price;

    Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("978-3-16-148410-0", "The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book("978-0-14-028333-4", "1984", "George Orwell", 8.99);
        Book book3 = new Book("978-0-7432-7356-5", "To Kill a Mockingbird", "Harper Lee", 12.99);

        book1.displayBook();
        System.out.println();
        book2.displayBook();
        System.out.println();
        book3.displayBook();
    }
}
