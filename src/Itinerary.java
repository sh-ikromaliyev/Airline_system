import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Itinerary {
    private Airport startingAirport;
    private Airport finalAirport;
    private Date creationDate;
    private List<FlightReservation> reservations;


    public Itinerary(Airport startingAirport, Airport finalAirport, Date creationDate, List<FlightReservation> reservations){
        this.startingAirport = startingAirport;
        this.finalAirport = finalAirport;
        this.creationDate = creationDate;
        this.reservations = reservations;
    }

    public Airport getStartingAirport() {
        return startingAirport;
    }

    public Airport getFinalAirport() {
        return finalAirport;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public List<FlightReservation> getReservations(){
        return reservations;
    }

    public void setStartingAirport(Airport startingAirport) {
        this.startingAirport = startingAirport;
    }

    public void setFinalAirport(Airport finalAirport) {
        this.finalAirport = finalAirport;
    }

    public void setReservations(List<FlightReservation> reservations) {
        this.reservations = reservations;
    }

    public boolean makeReservation(FlightReservation reservation){
        if(reservations == null){
            reservations = new ArrayList<>();
        }
        reservations.add(reservation);
        return true;
    }

    public boolean makePayment(){
        return true;
    }
}
