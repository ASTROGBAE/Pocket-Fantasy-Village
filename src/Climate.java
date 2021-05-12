import java.lang.Math.*;
import java.time.LocalDateTime;

public class Climate implements Event {

    public Climate() {
    }

    private Double calculateYield(int x) {
        double maxYield = 1;
        double period = 365.26;
        double phase = period/8;
        double vertshift = 0; //maxYield/2;
        return maxYield*Math.cos((2*Math.PI/period)*(x+phase))+vertshift;
    }

    @Override
    public double getProduction(LocalDateTime inputDate) {
        return calculateYield(inputDate.getDayOfYear()); // only works on the timescale of a year at present
    }
    
}
