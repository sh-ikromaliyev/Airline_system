import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class FlightReservation {
    private String reservationNumber;
    private FlightInstance flight;
    private Map<Passenger, FlightSeat> seatMap;
    private Date creationDate;
    private ReservationStatus status;


    public FlightReservation(String reservationNumber, FlightInstance flight, Map<Passenger,FlightSeat> seatMap, Date creationDate, ReservationStatus status){
        this.reservationNumber = reservationNumber;
        this.flight = flight;
        this.seatMap = seatMap;
        this.creationDate = creationDate;
        this.status = status;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public FlightInstance getFlight() {
        return flight;
    }

    public Map<Passenger, FlightSeat> getSeatMap() {
        return seatMap;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setFlight(FlightInstance flight) {
        this.flight = flight;
    }

    public void setSeatMap(Map<Passenger, FlightSeat> seatMap) {
        this.seatMap = seatMap;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public static FlightReservation fetchReservationDetails(String reservationNumber){
        return null;
    }
    public List<Passenger> getPassengers(){
        return new ArrayList<>(seatMap.keySet());

    }
}
