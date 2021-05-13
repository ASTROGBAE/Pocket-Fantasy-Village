import java.time.LocalDateTime; 

public class Main {
    public static void main(String[] args) {
        //TODO for concurrency, initialise all objects in a staging area like below, make staging class later
        //TODO make world class to encapsulate all events and village
        LocalDateTime date = LocalDateTime.of(851, 1, 1, 0, 0, 0);
        Village town = new Village(date); // why does this object need a date and none others???
        Climate world = new Climate();
        Attackers bandits = new Attackers();
        Log logger = new Log(town.getName());

        // loop for testing
        for (int i = 0; i < 365; i ++) {
            logger.update(date.toString() + "," + String.valueOf(town.getProduction())); // make this functionality in the log file
            System.out.println(town.getProduction());
            double dailyProduction = world.getProduction(date);// - bandits.getProduction(date); //TODO make a list of events and iterate through them instead
            town.addProduction(dailyProduction);
            date = date.plusDays(1);
        }
        logger.close();
    }
}
