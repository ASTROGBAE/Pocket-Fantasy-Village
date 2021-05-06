import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class Village {
    // food increases during harvest months
    // don't worry about seasons yet! too complicated
    // TODO implement a function to check season, have events that change based on season
    // TODO implement a function to check if a public holiday or something??
    // TODO implement some sort of text output, file IO for daily log of production?
    private int production; // generic variable for "health" of the city, expand to other variables later!
    private LocalDateTime previousDate;

    public Village () {
        production = 10;
        previousDate = LocalDateTime.now();
    }

    // TODO System only works on the timescale of days. Keep it this way for now but update later for smaller timescales, too 
    // log the present time of day and update existing village
    public void logToPresent() {
        long daysDifference = daysElapsed(LocalDateTime.now());
        if (daysDifference != 0) { // if the day has changed, update
            for (long day = daysDifference; day > 0; day --) { // iterate through each day passed, TODO might be more efficient to make this recursive!
                updateDaily();
            }
        }
    }

    // TODO create recursive update daily method, use in above logToPresent

    // outputs how many days have passed since last log
    public long daysElapsed(LocalDateTime presentDate) {
        return Duration.between(previousDate, presentDate).toDays();
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

    // town is attacked! lose between 1 and 5 production (makes it more interesting)
    public void attack() {
        production -= ThreadLocalRandom.current().nextInt(0, 6);
    }



    // TODO add methods for isAdbandoned, basic attacks, etc. 

}
