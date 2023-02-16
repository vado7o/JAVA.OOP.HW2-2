public class Main {
    public static void main(String[] args) {
        BookCase bookCase = new BookCase();

        bookCase.addBook(new Book("Детектив", 340, "Артур Конан Дойл", "Приключения Шерлока Холмса"));

        bookCase.open();

        bookCase.addBook(new Book("Детектив", 340, "Артур Конан Дойл", "Приключения Шерлока Холмса"));
        bookCase.addBook(new Book("Фэнтези", 400, "Джоан Кэтлин Роулинг", "Гарри Поттер"));
        bookCase.addBook(new Book("Поэма", 300, "Николай Васильевич Гоголь", "Мертвые души"));
        bookCase.addBook(new Book("Роман", 3000, "Лев Николаевич Толстой", "Война и мир"));
        bookCase.addBook(new Book("Роман", 240, "Джордж Оруэл", "1984"));
        bookCase.addBook(new Book("Исторический Роман", 200, "Александр Сергеевич Пушкин", "Капитанская дочка"));

        bookCase.showInfo();

        bookCase.have("Ревизор");
        bookCase.have("Мертвые души");

        bookCase.removeBook("Мертвые души");
        bookCase.showInfo();


    }
}