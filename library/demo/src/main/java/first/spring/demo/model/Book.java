package first.spring.demo.model;

import lombok.*;

import javax.persistence.*;
import java.lang.ref.SoftReference;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "book_name", nullable = false)
	private String name;

	@ManyToOne(targetEntity = Author.class) // много книг у одного автора
	@JoinColumn(name = "author_id")
	private Author author;

	@ManyToOne(targetEntity = Genre.class)  // много книг одного жанра
	@JoinColumn(name = "genre_id")
	private Genre genre;
}
