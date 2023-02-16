public class Book {
    private String genre;
    private int pages;
    private String author;
    private String name;

    Book(String genre, int pages, String author, String name) {
        this.author = author;
        this.genre = genre;
        this.name = name;
        this.pages = pages;
    }

    public String getInfo() {
        return "Жанр: " + genre + ". Автор: " + author + ". Название: " + name + ". Количество страниц: " + pages;
    }

    public String getName() {
        return name;
    }
}
