import java.sql.Time;

public class WeeklySchedule {
    private int dayOfWeek;
    private Time departureTime;

    public WeeklySchedule(int dayOfWeek, Time departureTime){
        this.dayOfWeek = dayOfWeek;
        this.departureTime = departureTime;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }
}
