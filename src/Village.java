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
    private int population; // TODO: add plots field
    private double food; // daily food intake/person
    private LocalDateTime curDate, startDate;

    public Village (String _name, LocalDateTime _initStart) {
        name = _name; //TODO make a name generator or prompt for input?
        population = 10;
        food = population*10;
        startDate = _initStart;
        curDate = _initStart;
    }

    // get methods

    public String getName() {
        return name;
    }

    public LocalDateTime getCurDate() {
        return curDate;
    }

    public int getPopulation() {
        return population;
    }

    public double getFood() {
        return food;
    }

    // modify values

    public void addDay() { // increase day (program works on daily increments)
        curDate.plusDays(1);
    }

    public void setPopulation(int change) { //TODO: change from set to change?
        population = change;
    }

    public void changeFood(double change) {
        food += change;
    }
}
