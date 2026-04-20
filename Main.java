import java.util.Scanner;


class Book {
    private String title;
    private String author;
    private int yearofPublication;
    private double isbn;

    public Book(String title, String author, int yearofPublication, double isbn) {
        this.title = title;
        this.author = author;
        this.yearofPublication = yearofPublication;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearofPublication() {
        return yearofPublication;
    }

    public double getIsbn() {
        return isbn;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter book author: ");
        String author = sc.nextLine();
        System.out.print("Enter book year of publication: ");
        int yearofPublication = sc.nextInt();
        System.out.print("Enter book ISBN: ");
        double isbn = sc.nextDouble();
        Book book = new Book(title, author, yearofPublication, isbn);
        System.out.println("Book Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year of Publication: " + book.getYearofPublication());
        System.out.println("ISBN: " + book.getIsbn());
        sc.close();
    }
}