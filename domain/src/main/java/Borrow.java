import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_borrow;
    @ManyToOne
    private Book book;
    @ManyToOne
    private Borrower borrower;
    private LocalDate date;
}
