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

    // TODO System only works on the timescale of days. Keep it this way for now but update later for smaller timescales, too 
    // log new date and update existing village from previous log
    public void log(LocalDateTime newDate) {
        long daysDifference = daysAfter(newDate);
        if (daysDifference != 0) { // if the day has changed is later, update
            for (long day = daysDifference; day > 0; day --) { // iterate through each day passed, TODO might be more efficient to make this recursive!
                updateDaily();
            }
        }
    }

    // TODO create recursive update daily method, use in above logToPresent

    // outputs how many days have passed since last log
    public long daysAfter(LocalDateTime newDate) {
        if (previousDate.isBefore(newDate)) { // if date is after
            return Duration.between(previousDate, newDate).toDays();
        }
        return 0;
    }

    // daily imcrement for first iteration (just generic increase now)
    // assumes day is indeed different
    public void updateDaily() {
        production +=1;
        if (isAttacked()) {
            attack();
        }
    }

    // TODO create a generic chance thing
    // calculate chance for town to be attacked (in percentages)
    public boolean isAttacked() {
        int attackChance = 10;
        int randomPerc = ThreadLocalRandom.current().nextInt(0, 101);
        if (randomPerc < attackChance) {
            return true;
        }
        return false;
    }

    //TODO: move into attack/event class
    // town is attacked! lose between 1 and 5 production (makes it more interesting)
    public void attack() {
        production -= ThreadLocalRandom.current().nextInt(0, 6);
    }



    // TODO add methods for isAdbandoned, basic attacks, etc. 

}
