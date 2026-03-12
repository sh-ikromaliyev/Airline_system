import java.util.List;

public class Airport {
    private String name;
    private Address address;
    private String code;

    public Airport(String name, Address address, String code){
        this.name = name;
        this.address = address;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Flight> getFlights(){
        return null;
    }
}
