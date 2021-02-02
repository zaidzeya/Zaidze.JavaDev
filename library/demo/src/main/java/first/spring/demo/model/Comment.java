package first.spring.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comment")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "description", nullable = false)
	private String description;

	@ManyToOne(targetEntity = Book.class, cascade = CascadeType.ALL) //много комментариев к одной книге
	@JoinColumn(name = "book_id")
	private Book book;
}
