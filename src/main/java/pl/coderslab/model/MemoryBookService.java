package pl.coderslab.model;

import org.springframework.stereotype.Component;
import pl.coderslab.pojo.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class MemoryBookService implements BookService{

    private List<Book> books;
    private static Long nextId = 6L;

    public MemoryBookService(){
        this.books = new ArrayList<>();
        books.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", "programming"));
        books.add(new Book(2L, "1234567132389", "Bad romance", "Dick Tracy", "Cool Publisher", "Crime"));
        books.add(new Book(3L, "9543287654321", "Me and you and a machine gun", "John Rambo", "Publish it", "Fantasy"));
        books.add(new Book(4L, "3013321456987", "Spiderman 27", "Peter Parker", "Bad Harry", "Action-Drama"));
        books.add(new Book(5L, "7894623654123", "The 100", "David Rhotenberg", "The Publisher", "Comedy"));
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Optional<Book> getById(Long id) {
        return books.stream().filter(element -> element.getId().equals(id)).findFirst();
    }

    @Override
    public void addBook(Book book) {
        book.setId(nextId++);
        books.add(book);
    }

    @Override
    public void deleteBook(Long id) {
        books.removeIf(element -> element.getId().equals(id));
    }

    @Override
    public void updateBook(Book book) {
        if (this.getById(book.getId()).isPresent()) {
            Integer indexOf = books.indexOf(this.getById(book.getId()).get());
            books.set(indexOf, book);
        }
    }
}
