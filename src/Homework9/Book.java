package Homework9;

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



}
