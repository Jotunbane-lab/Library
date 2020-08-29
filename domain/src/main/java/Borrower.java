import javax.persistence.*;

@Entity
public class Borrower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_borrower;
    private String first_name;
    private String last_name;
    @OneToOne
    private BorrowerDetails borrowerDetails;
}
