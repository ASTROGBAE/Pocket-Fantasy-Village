import java.util.concurrent.ThreadLocalRandom;

// abstract class of which everything else is a subclass. Implements random methods, etc.

public abstract class Utilities {

    int randInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }

    double randDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max+1);
    } 
}
