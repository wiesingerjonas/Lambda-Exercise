public class Pupil {

    private int id;
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private int postcode;
    private int city;


    public Pupil(int id, String lastName, String firstName, String dateOfBirth, int postcode, int city) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.postcode = postcode;
        this.city = city;
    }

    //region GETTER
    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostcode() {
        return postcode;
    }

    public int getCity() {
        return city;
    }
    //endregion

    //region SETTER
    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public void setCity(int city) {
        this.city = city;
    }
    //endregion


    @Override
    public String toString() {
        return firstName + " " + this.lastName + " was born on " + this.dateOfBirth + "and lives in" + this.postcode + " " + this.city;
    }
}
