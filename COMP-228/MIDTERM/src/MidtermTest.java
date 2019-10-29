public class MidtermTest {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new ScienceBook("scbook1", "12345", "PUB1", 2016);
        books[0].setPrice(10);

        books[1] = new ChildrenBook("cbook2", "1234556", "PUB2", 2016);
        books[1].setPrice(20);

        books[2] = new ChildrenBook("cbook333", "12345", "PUB2", 2017);
        books[2].setPrice(14);

        printInfo(books);
    }
    private static void printInfo(Book[] books){
        for (Book book:books) {
            System.out.println(book.toString());
        }
    }
}

abstract class Book {
    private String title;
    private String ISBN;
    private String publisher;
    double price;
    private int year;

    Book (String title, String ISBN, String publisher, int year) {
        setTitle(title);
        setISBN(ISBN);
        setPublisher(publisher);
        setYear(year);
    }

    public String toString() {
        return String.format("Book title: %s " +
                "ISBN: %s " +
                "publisher: %s " +
                "Price: $%.2f " +
                "Year: %d.",
                getTitle(), getISBN(),
                getPublisher(), this.price,
                getYear());
    }

    // Getters
    public String getTitle() {
        return title;
    }
    private String getISBN() {
        return ISBN;
    }
    private String getPublisher() {
        return publisher;
    }
    private int getYear() {
        return year;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // Abstract methods
    abstract void setPrice(double price);
}

class ScienceBook extends Book {

    ScienceBook(String title, String ISBN, String publisher, int year) {
        super(title, ISBN, publisher, year);
    }

    @Override
    void setPrice(double price) {
        double discount = 0.01; // 10% discount
        this.price = price - (price * discount);
    }
}

class ChildrenBook extends Book {

    ChildrenBook(String title, String ISBN, String publisher, int year) {
        super(title, ISBN, publisher, year);
    }

    @Override
    void setPrice(double price) {
        this.price = price;
    }
}