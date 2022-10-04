package lesson1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Елена", "Кулик");
        Author author2 = new Author("Иван", "Городецкий");
        Book book1 = new Book("Судьба или выбор", 2012); // Кулик Елена
        Book book2 = new Book("Видящий Маг", 2020); // Городецкий Иван
      
        System.out.format("Книга 1 Название %s  Год издания %d ", book1.getBookName(), book1.getYearPublication());
        System.out.format("Автор %s %s \n", author1.getNameAuthors(), author1.getSurnameAuthors());
        System.out.format("Книга 2 Название %s  Год издания %d ", book2.getBookName(), book2.getYearPublication());
        System.out.format("Автор %s %s \n\n", author2.getNameAuthors(), author2.getSurnameAuthors());

        book2.setYearPublication(2022);
        System.out.println("Изменен год на 2022");
        System.out.format("Книга 2 Название %s  Год издания %d ", book2.getBookName(), book2.getYearPublication());
        System.out.format("Автор %s %s \n", author2.getNameAuthors(), author2.getSurnameAuthors());

        // Применение метода toString
        System.out.println("\nРаспечатка при помощи метода toString");
        System.out.println("author1 = " + author1);
        System.out.println(book1.toString(author2.getNameAuthors(), author2.getSurnameAuthors()));

        if (book1.equals(book2)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные ");
        }
    }
}
