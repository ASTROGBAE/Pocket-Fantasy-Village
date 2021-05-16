import java.time.LocalDateTime;

public class Attackers extends Utilities implements Event {

    // TODO implement constructor (threat modifier?)

    // TODO create a generic chance thing
    // calculate chance for town to be attacked (in percentages)
    public boolean isAttacked() {
        int attackChance = 10;
        int randomPerc = randInt(0, 101);
        if (randomPerc < attackChance) {
            return true;
        }
        return false;
    }

    // town is attacked! lose between 1 and 5 production (makes it more interesting)
    public double attack() {
        if (isAttacked()) {
            return randInt(10, 50);
        }
        return 0;
    }

    @Override
    public double getProduction(LocalDateTime inputDate) {
        return attack();
    }
    
}
