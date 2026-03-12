import java.util.Date;
import java.sql.Time;

public class CustomSchedule {
    private Date customDate;
    private Time depurtureTime;


    public CustomSchedule(Date customDate, Time depurtureTime){
        this.customDate = customDate;
        this.depurtureTime = depurtureTime;
    }

    public Date getCustomDate() {
        return customDate;
    }

    public void setCustomDate(Date customDate) {
        this.customDate = customDate;
    }

    public Time getDepurtureTime() {
        return depurtureTime;
    }

    public void setDepurtureTime(Time depurtureTime) {
        this.depurtureTime = depurtureTime;
    }
}
