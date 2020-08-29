import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BorrowerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_borrower_details;
    private String address;
    private String email;
    private String phone;
}
