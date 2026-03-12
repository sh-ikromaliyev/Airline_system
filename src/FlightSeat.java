public class FlightSeat extends Seat{
    private double fare;

    public FlightSeat(double fare, String seatNumber, SeatType type, SeatClass seatClass){
        super(seatNumber, type, seatClass);
        this.fare = fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public double getFare(){
        return fare;
    }
}
