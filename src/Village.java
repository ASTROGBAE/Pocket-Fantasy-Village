import java.time.Duration;
import java.time.LocalDateTime;

public class Village {
    // food increases during harvest months
    // don't worry about seasons yet! too complicated
    private int production; // generic variable for "health" of the city, expand to other variables later!
    private LocalDateTime previousDate;

    public Village () {
        production = 10;
        previousDate = LocalDateTime.now();
    }

    // log the present time of day and update existing village
    public void logPresent() {
        long daysDifference = daysElapsed(LocalDateTime.now());
        if (daysDifference != 0) { // if the day has changed, update for each day!
            for (long day = daysDifference; day > 0; day --) {
                updateDaily();
            }
        }
    }

    // outputs how many days have passed since last log
    public long daysElapsed(LocalDateTime presentDate) {
        return Duration.between(previousDate, presentDate).toDays();
    }

    // daily imcrement for first iteration (just generic increase now)
    // assumes day is indeed different
    public void updateDaily() {
        production +=1;
    }

    // town is attacked! lose 1 production
    public void attack() {
        production -=1;
    }



    // TODO add methods for isAdbandoned, basic attacks, etc. 

}
