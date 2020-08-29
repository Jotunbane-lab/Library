import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_book;
    private boolean borrow;
    private String category;
    private String isbn;
    private int  pages;
    private LocalDate relase_date;
    private String summary;
    private String title;

    @ManyToOne
    private Author author;
}
