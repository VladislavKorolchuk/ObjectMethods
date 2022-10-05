package lesson1;

import java.util.Objects;

public class Author {
    protected String nameAuthors; // Имя автора
    protected String surnameAuthors; // Фамилия автора

    public Author(String nameAuthors, String surnameAuthors) {
        this.nameAuthors = nameAuthors;
        this.surnameAuthors = surnameAuthors;
    }

    @Override
    public String toString() {
        return nameAuthors + ' ' + surnameAuthors;
    }

    public String getNameAuthors() {
        return nameAuthors;
    }

    public String getSurnameAuthors() {
        return surnameAuthors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return nameAuthors.equals(author.nameAuthors) && surnameAuthors.equals(author.surnameAuthors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthors, surnameAuthors);
    }
}
