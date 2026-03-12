import java.util.List;

public class Flight {
    private String flightNumber;
    private Airport departure;
    private Airport arrival;
    private int durationInMinutes;
    private List<WeeklySchedule> weeklySchedules;
    private List<CustomSchedule> customSchedules;
    private List<FlightInstance> flightInstances;

    public Flight(String flightNumber, Airport departure, Airport arrival, int durationInMinutes, List<WeeklySchedule> weeklySchedules, List<CustomSchedule> customSchedules, List<FlightInstance> flightInstances){
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.durationInMinutes = durationInMinutes;
        this.weeklySchedules = weeklySchedules;
        this.customSchedules = customSchedules;
        this.flightInstances = flightInstances;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public List<WeeklySchedule> getWeeklySchedules() {
        return weeklySchedules;
    }

    public List<CustomSchedule> getCustomSchedules() {
        return customSchedules;
    }

    public List<FlightInstance> getFlightInstances() {
        return flightInstances;
    }

    public void setDeparture(Airport departure) {
        this.departure = departure;
    }

    public void setArrival(Airport arrival) {
        this.arrival = arrival;
    }

    public void setWeeklySchedules(List<WeeklySchedule> weeklySchedules) {
        this.weeklySchedules = weeklySchedules;
    }

    public void setCustomSchedules(List<CustomSchedule> customSchedules) {
        this.customSchedules = customSchedules;
    }

    public void setFlightInstances(List<FlightInstance> flightInstances) {
        this.flightInstances = flightInstances;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}
