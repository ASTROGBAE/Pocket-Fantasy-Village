import java.time.LocalDateTime;

public class Attackers extends Utilities implements Event {

    // TODO implement constructor (threat modifier?)

    // town is attacked! lose between 1 and 5 production (makes it more interesting)
    public double attack() {
        if (getPercentChance(10)) {
            return randInt(10, 50);
        }
        return 0;
    }

    @Override
    public double getProduction(LocalDateTime inputDate) {
        return attack();
    }
    
}
