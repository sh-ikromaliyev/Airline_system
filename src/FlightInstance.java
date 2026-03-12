import java.sql.Time;

public class FlightInstance {
    private Time departureTime;
    private String gate;
    private FlightStatus status;
    private Aircraft aircraft;

    public boolean cancel(){
        return true;
    }

    public void updateStatus(FlightStatus status){}
}
