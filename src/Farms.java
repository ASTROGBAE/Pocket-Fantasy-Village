import java.time.LocalDateTime;

public class Farms extends Utilities implements Event {
    int plots;
    public Farms (int plotNum) {
        plots = plotNum;
    }

    private double calculateYield() { // need to add a getValue function...
        double maxYield = 10;
        double period = 365.26;
        return maxYield*Math.cos((2*Math.PI/period)*(plots+period/8))+maxYield+getNoise(5.3);
    }



    @Override
    public double getValue(LocalDateTime inputDate) {
        return calculateYield();
    }
}
