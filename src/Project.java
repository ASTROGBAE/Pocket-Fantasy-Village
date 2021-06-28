public class Project extends Utilities {
    // this class contains an interger number of projects.

    // Given a float ratio and an integer number of customers, projects will always aim for the value ratio*input
    // let target = ratio*input. This is the number of projects needed.
    // let demand = target-projects.
    // if demand=0, do nothing. The needs are met.
    // If demand>0, the project number will be increased. For every project below the target, there will be a chance to increase by 1.
    // The greater the value of demand, the higher the chance of each project incrementing by 1.
    // if demand<0 and decay=false, the project number will decrease. All unneeded projects will be abandonded. Algorithmically, projects = target. 
    // if demand<0 and decay=true, the project number will be decreased. For every project above the target, there will be a chance to decrease by 1 (same ratio as increase).

    private float ratio; // ratio of projects needed per customer.
    private int projects;
    private boolean decay;

    public Project (int _projects, float _ratio, boolean _decay) {
        projects = _projects; 
        ratio = _ratio;
        decay = _decay;
    }

    // get methods

    public int getProjects() {
        return projects;
    }

    // will change value based on demand
    private void changeProduct (int demand, int amount) {
        for (int i = 0; i < demand; i ++) { // for every project value below the target, there is a change the number will grow! (10% for now)
            if (getPercentChance(1*demand)) { // TODO: upper bound this below 100 or make it scale waaaay slower? Will always succeed if too big. Use logarithm?
                projects += amount;
            }
        }
    }

    public double updateProject(int customer) {
        int target = (int)ratio*customer; // TODO: fix event problem!
        int demand = target-projects; 
        // if (demand == 0), do nothing!
        if (demand>0) { // not enough projects for target! Roll to increase
            changeProduct (demand, 1);
        }
        else { // target < projects, any excess project is automatically abadoned. 
            if (!decay) {
                projects = target;
            }
            else { // decay is true
                changeProduct (demand, -1);
            }
        }
        return 0;
    }
}
