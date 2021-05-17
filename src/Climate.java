import java.lang.Math.*;
import java.time.LocalDateTime;

public class Climate extends Utilities implements Event {

    double pressureCoefficient;

    public Climate() {
        pressureCoefficient = randDouble(0, 365);
    }

    private double calculatePressure() { // have normally distributed, with a slight chance of going nuts!
        return 0;
    }

    @Override
    public double getValue(LocalDateTime inputDate) {
        return 0; // only works on the timescale of a year at present
    }
    
}
