
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ogrenci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String isim;
    private String soyisim;
    private String numara;
    private int yas;

    // Getters and Setters
}
