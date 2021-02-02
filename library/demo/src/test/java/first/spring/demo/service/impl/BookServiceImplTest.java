package first.spring.demo.service.impl;

import first.spring.demo.service.BookService;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Сервис работы с книгами")
class BookServiceImplTest {
    private BookService bookService = new BookServiceImpl();

//	@DisplayName("Возвращает название книги, если такая есть")
//	@Test
//	public void getBookNameIfExists() {
//		String bookName = bookService.getBookName(5);
//		assertNotNull(bookName);
//		assertEquals("Три товарища", bookName);
//	}
//
//	@DisplayName("Возвращает текст ошибки 'нет такой книги!', если книги нет")
//	@Test
//	public void getBookNameIfNotExists() {
//		String bookName = bookService.getBookName(-1);
//		assertNotNull(bookName);
//		assertEquals("нет такой книги!", bookName);
//	}

}