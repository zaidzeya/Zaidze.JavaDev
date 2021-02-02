package first.spring.demo.dao.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Слой BookDao делает следующее")
@DataJpaTest
@Import(BookDaoImpl.class)
class BookDaoImplTest {

	@Autowired
	private BookDaoImpl repositoryJpa;

	@Autowired
	private TestEntityManager em;

//	private BookDao bookDao = new BookDaoImpl();
/*	@DisplayName("должен загружать список всех книг")
	@Test
	void shouldReturnCorrectBooks() {
		SessionFactory sessionFactory = em.getEntityManager().getEntityManagerFactory()
				.unwrap(SessionFactory.class);
		sessionFactory.getStatistics().setStatisticsEnabled(true);

		val books = repositoryJpa.getAllBooks();
		assertThat(books).isNotNull().hasSize(3);
	}*/

//	@DisplayName("Возвращает Optional с книгой внури, если она есть")
//	@Test
//	public void getBookNameExist() {
//		Optional<Book> optBook = bookDao.getBookById(5);
//		assertNotNull(optBook);
//		assertTrue(optBook.isPresent());
//		assertEquals(5, optBook.get().getId());
//	}
//
//	@DisplayName("Возвращает пустой Optional если книги нет")
//	@Test
//	public void getBookNotExist(){
//		Optional<Book> optBook = bookDao.getBookById(-1);
//		assertNotNull(optBook);
//		assertFalse(optBook.isPresent());
//	}

}