import java.util.concurrent.ThreadLocalRandom;

// abstract class of which everything else is a subclass. Implements random methods, etc.

public abstract class Utilities {

    int randInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    double randDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    } 

    double getNoise(double st) {
        return st*ThreadLocalRandom.current().nextGaussian();
    }

    boolean getPercentChance(int chance) {
        int roll = randInt(1, 101);
        if (roll < chance) {
            return false;
        }
        return true;
    }
}
