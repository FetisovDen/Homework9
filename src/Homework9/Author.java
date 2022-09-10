package Homework9;

import java.util.Objects;

public class Author {
    private final String authorName;
    private final String authorSurName;


    public Author (String authorName, String authorSurName) {
        this.authorName = authorName;
        this.authorSurName = authorSurName;
    }

    public String getAuthorName() {

        return authorName;
    }
    public String getAuthorSurName() {

        return authorSurName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName) && authorSurName.equals(author.authorSurName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurName);
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSurName='" + authorSurName + '\'' +
                '}';
    }
}


