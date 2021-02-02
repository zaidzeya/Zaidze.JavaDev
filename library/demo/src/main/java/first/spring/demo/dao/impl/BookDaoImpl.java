package first.spring.demo.dao.impl;

import first.spring.demo.dao.BookDao;
import first.spring.demo.model.Book;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BookDaoImpl implements BookDao {
	private final List<Book> books;
	private final Map<Integer, Book> bookMap;

	public BookDaoImpl() {
		this.books = new ArrayList<>();
		books.add(new Book(1,"Атлант расправил плечи", "Айн Рэнд", "USA"));
		books.add(new Book(2,"Женщины Лазаря", "Марина Степанова", "RUS"));
		books.add(new Book(3,"Цветы для Элджернона", "Дэниел Киз", "USA"));
		books.add(new Book(4,"Братья Карамазовы", "Фёдор Достоевский", "RUS"));
		books.add(new Book(5,"Три товарища", "Эрих Мария Ремарк", "DEU"));
		books.add(new Book(6,"Братья и сёстры", "Федор Абрамов", "RUS"));
		books.add(new Book(7,"Большие надежды", "Чарльз Диккенс", "ENU"));

		bookMap = books.stream()
				.collect(Collectors.toMap(Book::getId, Function.identity()));
	}

	@Override
	public List<Book> getAllBooks() {
		return Collections.unmodifiableList(books);
	}

	@Override
	public Optional<Book> getBookById(Integer id) {
		Book book = null;
		for (Book item : books){
			if (id == item.getId()){
				book = item;
				break;
			}
		}
		return Optional.ofNullable(book);
	}

	@Override
	public int addNewBook(Book book) {
		books.add(book);
		return book.getId();
	}

}
