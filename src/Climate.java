import java.lang.Math.*;
import java.time.LocalDateTime;

public class Climate implements Event {

    public Climate() {
    }

    private Double calculateYield(int x) {
        double maxYield = 50;
        double period = 365.26;
        double phase = -period/4;
        double vertshift = maxYield/2;
        return maxYield*Math.sin(2*Math.PI/period*(x+phase))+vertshift;
    }

    @Override
    public double modProduction(LocalDateTime inputDate) {
        return calculateYield(inputDate.getDayOfYear()); // only works on the timescale of a year at present
    }
    
}
