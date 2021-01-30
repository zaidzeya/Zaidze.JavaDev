package first.spring.demo.service;

import first.spring.demo.model.Book;

import java.util.List;

public interface BookService {
	List<Book> getAllBooks();
	/**
	 * Возвращает Название книги. Если нет - то текст "нет такой книги!"
	 * @param id
	 * @return
	 */
	String getBookName(Integer id);

	int addNewBook(Book book);

}
