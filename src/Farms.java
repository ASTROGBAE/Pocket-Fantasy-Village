public class Farms extends Utilities implements Event {

    Project plots;
    
    public Farms (int plotNum) {
        plots = new Project (10, (float) 0.5);
    }

    private double calculateYield(int population) { // need to add a getValue function...
        double maxYield = 10;
        double period = 365.26;
        return maxYield*Math.cos((2*Math.PI/period)*(period/8))+maxYield+getNoise(5.3);
    }

    @Override
    public void updateEventDaily(Village town) {
        int population = town.getPopulation();
        town.changeFood(calculateYield(population)); // update food value
    }
}
