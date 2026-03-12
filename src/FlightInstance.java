import java.sql.Time;

public class FlightInstance {
    private Time departureTime;
    private String gate;
    private FlightStatus status;
    private Aircraft aircraft;


    public FlightInstance(Time departureTime, String gate, FlightStatus status, Aircraft aircraft){
        this.departureTime = departureTime;
        this.gate = gate;
        this.status = status;
        this.aircraft = aircraft;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public String getGate() {
        return gate;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public boolean cancel(){
        status = FlightStatus.CANCELLED;
        return true;

    }

    public void updateStatus(FlightStatus status){
        this.status = status;
    }

}
