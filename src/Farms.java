public class Farms extends Utilities implements Event {

    Project plots;
    
    public Farms (int plotNum) {
        plots = new Project (10, (float) 0.5, false); // plots are not used...
    }

    private double calculateSurplus(int population, int _plots) { // need to add a getValue function...
        double maxYield = 1;
        double period = 365.26;
        double yield = _plots*Math.cos((2*Math.PI/period)*(period/8))+maxYield+getNoise(5.3); // yield from crops
        return yield - population; // minus population as they eat the yield
    } 

    @Override
    public void updateEventDaily(Village town) {
        int population = town.getPopulation();
        plots.updateProject(population); // update num of plots based on farmers
        town.changeFood(calculateSurplus(population, plots.getProjects())); // update food value from plots
    }
}
