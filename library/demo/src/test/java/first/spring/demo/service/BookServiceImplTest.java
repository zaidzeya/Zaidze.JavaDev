package first.spring.demo.service;

import first.spring.demo.model.Book;
import first.spring.demo.service.impl.BookServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Сервис работы с книгами")
public class BookServiceImplTest {
	private BookService bookService = new BookServiceImpl();

	@DisplayName("Возвращает название книги, если такая есть")
	@Test
	public void getBookNameIfExists() {
		String bookName = bookService.getBookName(5);
		assertNotNull(bookName);
		assertEquals("Три товарища", bookName);
	}

	@DisplayName("Возвращает текст ошибки 'нет такой книги!', если книги нет")
	@Test
	public void getBookNameIfNotExists() {
		String bookName = bookService.getBookName(-1);
		assertNotNull(bookName);
		assertEquals("нет такой книги!", bookName);
	}
}
