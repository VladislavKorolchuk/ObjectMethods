package lesson1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Елена", "Кулик");
        Author author2 = new Author("Иван", "Городецкий");
        Book book1 = new Book(author1, "Судьба или выбор", 2012); // Кулик Елена
        Book book2 = new Book(author2, "Видящий Маг", 2020); // Городецкий Иван
        System.out.println(book1.toString());
        System.out.println(book2.toString());

        book2.setYearPublication(2022);
        System.out.println(book2.toString());

        if (book1.equals(book2)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }
    }
}
