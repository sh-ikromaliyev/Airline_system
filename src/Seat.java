public class Seat {
    private String seatNumber;
    private SeatType type;
    private SeatClass seatClass;

    public Seat(String seatNumber, SeatType type, SeatClass seatClass){
        this.seatNumber = seatNumber;
        this.type = type;
        this.seatClass = seatClass;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public SeatType getType() {
        return type;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(SeatClass seatClass) {
        this.seatClass = seatClass;
    }

    public void setType(SeatType type) {
        this.type = type;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}
