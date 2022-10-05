package lesson1;

import java.util.Objects;

public class Book {
    private Author author; // Автор
    private String bookName; // Название книги
    private int yearPublication;  // Год публикации

    public Book(Author author, String bookName, int yearPublication) {
        this.author = author;
        this.bookName = bookName;
        this.yearPublication = yearPublication;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public String toString() {
        return "Название книги='" + bookName + '\'' +
                ", год издания=" + yearPublication + " Автор: " + author.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(author, book.author) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, yearPublication);
    }
}
