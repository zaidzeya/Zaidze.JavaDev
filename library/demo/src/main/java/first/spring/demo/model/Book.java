package first.spring.demo.model;

import lombok.*;

import javax.persistence.*;
import java.lang.ref.SoftReference;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // Указывает, что данный класс является сущностью
@Table(name = "book") // Задает имя таблицы, на которую будет отображаться сущность
public class Book {
	@Id // Позволяет указать какое поле является идентификатором
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Стратегия генерации идентификаторов
	private long id;

	// Задает имя и некоторые свойства поля таблицы, на которое будет отображаться поле сущности
	@Column(name = "book_name", nullable = false, unique = false)
	private String name;

	// Указывает на связь между таблицами "один к одному"
	@ManyToOne(targetEntity = Author.class)
	// Задает поле, по которому происходит объединение с таблицей для хранения связанной сущности
	@JoinColumn(name = "author_id")
	private Author author;

	// Указывает на связь между таблицами "один к одному"
	@OneToOne(targetEntity = Genre.class)
	// Задает поле, по которому происходит объединение с таблицей для хранения связанной сущности
	@JoinColumn(name = "genre_id")
	private Genre genre;

}
