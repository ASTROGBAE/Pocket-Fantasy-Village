import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class Village {
    // food increases during harvest months
    // don't worry about seasons yet! too complicated
    // TODO implement a function to check season, have events that change based on season
    // TODO implement an event interface class
    // TODO implement a function to check if a public holiday or something??
    // TODO implement some sort of text output, file IO for daily log of production?
    private String name; // name of village
    private int production; // generic variable for "health" of the city, expand to other variables later!
    private LocalDateTime previousDate, startDate;

    public Village (LocalDateTime initStart) {
        name = "Genericville"; //TODO make a name generator or prompt for input?
        production = 10;
        startDate = initStart;
        previousDate = initStart;
    }

    // get methods

    public int getProduction() {
        return production;
    }

    public LocalDateTime getPreviousDate() {
        return previousDate;
    }

    // other methods

    // TODO create recursive update daily method, use in above logToPresent

    // outputs how many days have passed since last passTime
    public long daysAfter(LocalDateTime newDate) {
        if (previousDate.isBefore(newDate)) { // if date is after
            return Duration.between(previousDate, newDate).toDays();
        }
        return 0;
    }



    // TODO add methods for isAdbandoned, basic attacks, etc. 

}
