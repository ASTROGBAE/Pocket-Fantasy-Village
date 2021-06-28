public class Population implements Event {

    private Project popProject; // population

    public Population (int _number) {
        popProject = new Project(_number, 1, true);
    }

    // get methods

    public int getPopulation() {
        return popProject.getProjects();
    }

    @Override
    public void updateEventDaily(Village town) {
        popProject.updateProject((int)town.getFood());
        town.setPopulation(popProject.getProjects());
    }
    
}
