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
    public void update(Village town) {
        // only works on the timescale of a year at present
    }
    
}
