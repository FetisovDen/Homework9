package Homework9;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author publisherName;
    private int publishingYear;

    public Book(String bookName, Author publisherName, int publishingYear) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.publisherName = publisherName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Author getPublisherName() {
        return this.publisherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && bookName.equals(book.bookName) && publisherName.equals(book.publisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publisherName, publishingYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", publisherName=" + publisherName +
                ", publishingYear=" + publishingYear +
                '}';
    }
}
