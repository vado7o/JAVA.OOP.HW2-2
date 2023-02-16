import java.util.ArrayList;
import java.util.List;

public class BookCase {
    private int capacity;
    private Boolean opened;
    private List<Book> list;

    public BookCase() {
         list = new ArrayList<>();
         capacity = 20;
         opened = false;
    }

    public void showInfo() {
        int count = 1;
        System.out.println("\nВ настоящее время в нашем шкафу " + list.size() + " книг:");
        for (Book book: list) {
            System.out.println(count + ". " + book.getInfo());
            count++;
        }
    }
    public void addBook(Book book) {
        if (!opened) {
            System.out.println("\nШкаф закрыт! Чтобы положить книгу, необходимо его открыть!!!");
        }
        else {
            if (list.size() < capacity) {
                list.add(book);
                System.out.println("Книга '" + book.getName() + "' добавлена в шкаф!");
            }
            else System.out.println("В шкафу нет больше свободного места!!!");
        }
    }
    public void removeBook(String name) {
        for (Book b: list) {
            if (b.getName().equals(name)) {
                list.remove(b);
                System.out.println("'" + name + "' изъята из шкафа!");
                return;
            }
        }
    }

    public void open() {
        if (opened) System.out.println("\nШкаф уже стоит открытый!!!");
        else {
            opened = true;
            System.out.println("\nШкаф открыт!!!");
        }
    }
    public void have(String name) {
        for (Book b: list) {
            if (b.getName().equals(name)) {
                System.out.println("\nДа, '" + name + "' есть в шкафу!!!");
                return;
            }
        }
        System.out.println("\n'" + name + "' ещё нет пока в шкафу!");
    }
}
