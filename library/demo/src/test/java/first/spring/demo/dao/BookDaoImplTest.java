package first.spring.demo.dao;

import first.spring.demo.dao.impl.BookDaoImpl;
import first.spring.demo.model.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Слой BookDao делает следующее")
public class BookDaoImplTest {
	private BookDao bookDao = new BookDaoImpl();

	@DisplayName("Возвращает Optional с книгой внури, если она есть")
	@Test
	public void getBookNameExist() {
		Optional<Book> optBook = bookDao.getBookById(5);
		assertNotNull(optBook);
		assertTrue(optBook.isPresent());
		assertEquals(5, optBook.get().getId());
	}

	@DisplayName("Возвращает пустой Optional если книги нет")
	@Test
	public void getBookNotExist(){
		Optional<Book> optBook = bookDao.getBookById(-1);
		assertNotNull(optBook);
		assertFalse(optBook.isPresent());
	}

}
