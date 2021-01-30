package first.spring.demo.service.impl;

import first.spring.demo.dao.BookDao;
import first.spring.demo.dao.impl.BookDaoImpl;
import first.spring.demo.model.Book;
import first.spring.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
	private final BookDao bookDao = new BookDaoImpl();

	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public String getBookName(Integer id) {
		return bookDao.getBookById(id)
				.map(u -> u.getName())
				.orElse("нет такой книги!");
	}

	@Override
	public int addNewBook(Book book) {
		bookDao.addNewBook(book);
		return book.getId();
	}

}
