package first.spring.demo.dao.impl;

import first.spring.demo.dao.BookDao;
import first.spring.demo.model.Book;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

@Transactional
@Repository
public class BookDaoImpl implements BookDao {

	@PersistenceContext
	private EntityManager em;


	@Override
	public List<Book> getAllBooks() {
		return em.createQuery("select s from Book s", Book.class)
				.getResultList();
	}

	@Override
	public Optional<Book> getBookById(Integer id) {
		/*Book book = null;
		for (Book item : books) {
			if (id == item.getId()) {
				book = item;
				break;
			}
		}
		return Optional.ofNullable(book);*/
		return null;
	}

	@Override
	public Long addNewBook(Book book) {
//		books.add(book);
//		return book.getId();
		return null;
	}

}
