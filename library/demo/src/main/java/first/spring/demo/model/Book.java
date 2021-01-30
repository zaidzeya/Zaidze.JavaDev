package first.spring.demo.model;

import java.lang.ref.SoftReference;

public class Book {
	private int id;
	private String name;
	private String author;
	private String country;

	public Book() {
	}

	public Book(int id, String name, String author, String country) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getCountry() {
		return country;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", name='" + name + '\'' +
				", author='" + author + '\'' +
				", country='" + country + '\'' +
				'}';
	}
}
