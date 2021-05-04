public class Village {
    // food increases during harvest months
    // spring is sowing (prod), summer is growing (prod), autunm is harvest (getting the food), winter is rest (nothing much happening)
    private int population, // = 1 person
    food; // daily intake per person
    double production; // portion of population working daily
    private int year = 365; // set to get year, base on date object for leap years

    enum Season {WINTER, SPRING, SUMMER, AUTUNM}
    public Village () {
        population = 10;
        food = year*population; // starting food is enough for 1 year with current population
        production = 1;
    }

    // daily imcrement for first iteration
    public void updateDaily() {
        Season cur = getSeason();
        switch(cur) {
            // TODO how do you gain food?
            case WINTER:
                // nothing
            case SPRING:
                production -= 1; // TODO update these thingies
            case SUMMER:
                production =- 1;
            case AUTUNM:
                food =- population; //TODO make food dependant on population? So one daily food intake of one person
        }
    }

    // return 0 for winter, 1 for spring, 2 for summer, 3 for autunm 
    private Season getSeason() {
        //TODO implement with date object!
        return 0;
    }

    // TODO add methods for isAdbandoned, basic attacks, etc. 

}
