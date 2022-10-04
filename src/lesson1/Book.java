package lesson1;

import java.util.Objects;

public class Book {
    private String bookName; // Название книги
    private int yearPublication;  // Год публикации


    public Book(String bookName, int yearPublication) {
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


    public String toString(String nameAuthors, String surnameAuthors) {
        System.out.println("nameAuthors = ");
        return "Название книги='" + bookName + '\'' +
                ", год издания=" + yearPublication + " Автор: " + nameAuthors + " " + surnameAuthors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearPublication);
    }
}
