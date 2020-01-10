import java.util.Date;

public class Pupils {

    private int id;
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
    private int postcode;
    private int city;


    public Pupils(int id, String lastName, String firstName, Date dateOfBirth, int postcode, int city) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.postcode = postcode;
        this.city = city;
    }

}
