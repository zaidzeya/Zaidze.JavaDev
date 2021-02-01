package first.spring.demo.dao;

import first.spring.demo.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookDao {
	List<Book> getAllBooks();

	Optional<Book> getBookById(Integer id);

	Long addNewBook(Book book);
}
