package first.spring.demo.shell;

import first.spring.demo.model.Book;
import first.spring.demo.service.BookService;
import first.spring.demo.service.impl.BookServiceImpl;
import lombok.RequiredArgsConstructor;
//import org.springframework.shell.standard.ShellComponent;
//import org.springframework.shell.standard.ShellMethod;

import java.util.List;

//ShellComponent
//@RequiredArgsConstructor
public class LibraryCommands {
	private BookService bookService = new BookServiceImpl();

	//@ShellMethod(value = "Get All Books", key = {"get", "getAllBook"})
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	//@ShellMethod(value = "Add New Books", key = {"add", "addNewBook"})
	public Long addNewBook() {
		return bookService.addNewBook(new Book()); //TODO исправить вызов
	}
}