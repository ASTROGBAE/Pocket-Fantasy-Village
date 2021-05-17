import java.time.Duration;
import java.time.LocalDateTime;

public class Village {
    // food increases during harvest months
    // don't worry about seasons yet! too complicated
    // TODO implement a function to check season, have events that change based on season
    // TODO implement an event interface class
    // TODO implement a function to check if a public holiday or something??
    // TODO implement some sort of text output, file IO for daily log of production?
    private String name; // name of village
    private double production; // generic variable for "health" of the city, expand to other variables later!
    private LocalDateTime previousDate, startDate;

    public Village (LocalDateTime initStart) {
        name = "Genericville"; //TODO make a name generator or prompt for input?
        production = 10;
        startDate = initStart;
        previousDate = initStart;
    }

    // get methods

    public String getName() {
        return name;
    }

    public double getProduction() {
        return production;
    }

    public LocalDateTime getPreviousDate() {
        return previousDate;
    }

    // other methods

    public void addProduction(double addition) {
        production += addition;
    }
}
