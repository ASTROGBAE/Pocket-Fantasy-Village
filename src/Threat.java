public class Threat extends Utilities implements Event {

    String name;
    int dailyChance;
    int minDamage;
    int maxDamage;

    public Threat(String _name, int _dailyChance, int _minDamage, int _maxDamage) {
        name = _name;
        dailyChance = _dailyChance;
        minDamage = _minDamage;
        maxDamage = _maxDamage;
    }

    // town is attacked! lose between 1 and 5 production (makes it more interesting)
    public double attack() {
        if (getPercentChance(dailyChance)) {
            return randInt(minDamage, maxDamage);
        }
        return 0;
    }

    @Override
    public void update(Village town) {
        town.changeFood(attack()); // TODO: make attacks work on something other than food, lel. Maybe add attack type for different resource targets?
    }
    
}
