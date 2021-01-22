package pl.coderslab.model;

import pl.coderslab.pojo.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> getBooks();

    void addBook(Book book);

    Optional<Book> getById(Long id);

    void deleteBook(Long id);

    void updateBook(Book book);
}
