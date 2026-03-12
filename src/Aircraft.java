import java.util.List;
public class Aircraft {
    private String name;
    private String model;
    private int manufacturingYear;
    private List<Seat> seats;

    public Aircraft(String name, String model, int manufacturingYear, List<Seat> seats){
        this.name = name;
        this.manufacturingYear = manufacturingYear;
        this.seats = seats;
    }


    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<FlightInstance> getFlights(){
        return null;
    }
}
