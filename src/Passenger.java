import java.util.Date;
public class Passenger {
    private String name;
    private String passwordNumber;
    private Date dateOfBirth;

    public Passenger(String name, String passwordNumber, Date dateOfBirth){
        this.name = name;
        this.passwordNumber = passwordNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getPasswordNumber() {
        return passwordNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswordNumber(String passwordNumber) {
        this.passwordNumber = passwordNumber;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportNumber(){
        return "a";
    }
}
