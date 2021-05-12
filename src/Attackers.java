import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class Attackers implements Event {

    // TODO implement constructor (threat modifier?)

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
    public double attack() {
        if (isAttacked()) {
            return ThreadLocalRandom.current().nextInt(0, 6);
        }
        return 0;
    }

    @Override
    public double getProduction(LocalDateTime inputDate) {
        return attack();
    }
    
}
